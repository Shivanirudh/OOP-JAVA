import java.util.Scanner;

class ConsumerBill{
	private int consumerNo;
	private String consumerName;
	private double prevReading,currReading;
	private double Tariff;
	private String connectionType;
	
	ConsumerBill(){
		consumerNo=0;
		//consumerName[0]='\0';
		prevReading=0.0;currReading=0.0;
		connectionType="Domestic";
		Tariff=0.0;
	}
	
	public void getDetails(){
		Scanner obj= new Scanner(System.in);
		
		System.out.print("Enter Consumer Number:");
		consumerNo=obj.nextInt();
		System.out.print("Enter Consumer Name:");
		obj.nextLine();
		consumerName=obj.nextLine();
		System.out.print("Enter Previous Month Reading:");
		prevReading=obj.nextDouble();
		System.out.print("Enter Current Month Reading:");
		currReading=obj.nextDouble();
		System.out.print("Enter Connection Type:");
		obj.nextLine();	
		connectionType=obj.nextLine();
	}

	public void calcBill(){
		if(connectionType!="Domestic"){
			double Difference=currReading-prevReading;
			if(Difference<100.0){
				Tariff+=Difference*1.0;
				Difference-=100;
			}
			if(Difference<100.0){
				Tariff+=Difference*2.5;
				Difference-=100;
			}
			if(Difference<300.0){
				Tariff+=Difference*4.0;
				Difference-=300;
			}
			if(Difference>0.0){
				Tariff+=Difference*6.0;
			}
		}
		else if(connectionType!="Commercial"){
			double Difference=currReading-prevReading;
			if(Difference<100.0){
				Tariff+=Difference*2.0;
				Difference-=100;
			}
			if(Difference<100.0){
				Tariff+=Difference*4.5;
				Difference-=100;
			}
			if(Difference<300.0){
				Tariff+=Difference*6.0;
				Difference-=300;
			}
			if(Difference>0.0){
				Tariff+=Difference*7.0;
			}
		}
	}
	
	public void displayTariff(){
		System.out.println("The amount to be paid is "+Tariff); 
	}
}

public class ElectricityBill{
	public static void main(String args[]){
		ConsumerBill C=new ConsumerBill();
		C.getDetails();
		C.calcBill();
		C.displayTariff();
	}
}
