import myPack.CurrConvertor;
import java.util.Scanner;

public class TestPackage{
	public static void main(String args[]){
		
		myPack.CurrConvertor cc=new myPack.CurrConvertor();
		
		Scanner in=new Scanner(System.in);
		
		double x;
		int opt=0;
		do{
			try{
				System.out.println("\nChoose input currency format\n 1-INR\n 2-USD");
				System.out.println(" 3-Euro\n 4-Yen\n 0-Exit");
				System.out.print(" Your choice: ");
				opt=in.nextInt();
			
				if(opt==1){
					System.out.print(" Enter INR value ");x=in.nextDouble();
					cc.fromINR(x);
					cc.Display();
				}
				else if(opt==2){
					System.out.print(" Enter USD value ");x=in.nextDouble();
					cc.fromUSD(x);
					cc.Display();
				}
				else if(opt==3){
					System.out.print(" Enter Euro value ");x=in.nextDouble();
					cc.fromEuro(x);
					cc.Display();
				}
				else if(opt==4){
					System.out.print(" Enter Yen value ");x=in.nextDouble();
					cc.fromYen(x);
					cc.Display();
				}
				else if(opt!=0)
					throw new NumberFormatException();
				else;
			}
			catch(NumberFormatException e){
				System.out.println("Invalid Input Format ");
			}
			
		}while(opt!=0);
	}
}

/*
Output:
Choose input currency format
 1-INR
 2-USD
 3-Euro
 4-Yen
 0-Exit
 Your choice: 1
 Enter INR value 1000

INR: 1000.0
USD: 14.0
Euro: 13.0
Yen: 1490.0

Choose input currency format
 1-INR
 2-USD
 3-Euro
 4-Yen
 0-Exit
 Your choice: 2
 Enter USD value 1000

INR: 71180.0
USD: 1000.0
Euro: 900.0
Yen: 106160.0

Choose input currency format
 1-INR
 2-USD
 3-Euro
 4-Yen
 0-Exit
 Your choice: 3
 Enter Euro value 1000

INR: 78920.0
USD: 1110.0
Euro: 1000.0
Yen: 117690.0

Choose input currency format
 1-INR
 2-USD
 3-Euro
 4-Yen
 0-Exit
 Your choice: 4
 Enter Yen value 1000

INR: 670.0
USD: 9.4
Euro: 8.5
Yen: 1000.0

Choose input currency format
 1-INR
 2-USD
 3-Euro
 4-Yen
 0-Exit
 Your choice: 5
Invalid Input Format 

Choose input currency format
 1-INR
 2-USD
 3-Euro
 4-Yen
 0-Exit
 Your choice: 0
*/				
			
