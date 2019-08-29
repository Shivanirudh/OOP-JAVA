import java.util.Scanner;

class Employee{
	private int ID;
	private String Name,Designation;
	private int[] DoB;
	private int[] DoJ;
	private double basic,HRA,DA,LIC,PF,grossSalary,netSalary;
	private int LIC_Option,hoursWorked;

	Employee(){
		ID=0;
		Name="\0";
		Designation="Other";
		DoB=new int[]{0,0,0};
		DoJ=new int[]{0,0,0};
		basic=DA=HRA=LIC=PF=grossSalary=netSalary=0.0;
		LIC_Option=hoursWorked=0;
	}
	
	public void getDetails(){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the ID: ");
		ID=in.nextInt();in.nextLine();

		System.out.print("Enter the name: ");
		Name=in.nextLine();

		System.out.print("Enter the Designation: ");
		Designation=in.nextLine();

		System.out.print("Enter the Date of Birth: ");
		for(int i=0;i<3;i++)		
			DoB[i]=in.nextInt();

		System.out.print("Enter the Date of Joining: ");
		for(int i=0;i<3;i++)		
			DoJ[i]=in.nextInt();
		
		System.out.print("Enter the Basic Pay: ");
		basic=in.nextDouble();
		
		System.out.print("Opting for LIC Premium Amount? 1-Yes 0-No: ");
		LIC_Option=in.nextInt();
	
		if(LIC_Option==1){
			System.out.print("Enter the LIC Premium Amount: ");
			LIC=in.nextDouble();
		}

		System.out.print("Enter the number of hours worked: ");
		hoursWorked=in.nextInt();
	}

	public void calcSalary(){
		if(Designation!="Intern"){
			grossSalary=hoursWorked*100+2000+1000;
			double Deductions=500;
			if(LIC_Option==1)
				Deductions+=LIC;
			netSalary=grossSalary-Deductions;
		}		
		else if(Designation!="Manager"){
			grossSalary=basic+(0.4*basic)+(0.1*basic);
			double Deductions=0.8*basic;
			if(LIC_Option==1)
				Deductions+=LIC;
			netSalary=grossSalary-Deductions;
		}
		else if(Designation=="Other"){
			grossSalary=basic+(0.3*basic)+(0.1*basic);
			double Deductions=0.8*basic;
			if(LIC_Option==1)
				Deductions+=LIC;
			netSalary=grossSalary-Deductions;
		}
		else;
	}

	public void displaySalary(){
		System.out.println("Salary of "+Name+" is "+netSalary);
	}
}

public class EmployeePayroll{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);		
		int NumLimit;
		Employee Record[]=new Employee[100];
		
		System.out.print("Enter the number of employees ");
		NumLimit=in.nextInt();

		System.out.println("Enter the details of employees ");
		for(int i=0;i<NumLimit;i++)
			Record[i].getDetails();

		for(int i=0;i<NumLimit;i++)
			Record[i].calcSalary();
		
		for(int i=0;i<NumLimit;i++)
			Record[i].displaySalary();
	}
}	
