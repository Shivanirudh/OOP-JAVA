/*2. Develop a Java application with Employee class with Emp_name, Emp_id, Address, Mail_id,
Mobile_no as members. Inherit the classes, Programmer, Assistant Professor, Associate Professor
and Professor from employee class. Add Basic Pay (BP) as the member of all the inherited classes
with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP for staff club fund.
Generate pay slips for the employees with their gross and net salary.*/

import java.util.Scanner;

class Employee{
	String Emp_name;
	int Emp_id;
	String Address;
	String Mail_id;
	String Mobile_no;
	
	void readDetails(){
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter Name :");Emp_name=in.nextLine();
		System.out.print("Enter ID :");Emp_id=in.nextInt();
		System.out.print("Enter Address :");Address=in.nextLine(); in.nextLine();
		System.out.print("Enter Mail ID :");Mail_id=in.nextLine();
		System.out.print("Enter Mobile Number :");Mobile_no=in.nextLine();
	}
	
	void display(){
	
		System.out.println("Name: "+Emp_name);
		System.out.println("ID: "+Emp_id);
		System.out.println("Address: "+Address);
		System.out.println("Mail ID: "+Mail_id);
		System.out.println("Mobile Number: "+Mobile_no);
	}
}

class Programmer extends Employee{
	double BP;
	double DA,GS,NS;
	double HRA,PF,SCF;
	
	Programmer(double basic){
		BP=basic;
		DA=0.97*basic;HRA=0.1*basic;
		GS=BP+DA+HRA;
		PF=0.12*basic;SCF=0.001*basic;
		double Ded=PF+SCF;
		NS=GS-Ded;
	}
		
	void display(){
		super.display();
		
		System.out.println("BP: "+BP);
		System.out.println("DA: "+DA);
		System.out.println("HRA: "+HRA);
		System.out.println("Gross Salary: "+GS);
		System.out.println("PF: "+PF);
		System.out.println("SCF: "+SCF);
		System.out.println("Net Salary: "+NS);
	}
}

class AssistantProfessor extends Employee{
	double BP;
	double DA,GS,NS;
	double HRA,PF,SCF;
	
	AssistantProfessor(double basic){
		BP=basic;
		DA=0.97*basic;HRA=0.1*basic;
		GS=BP+DA+HRA;
		PF=0.12*basic;SCF=0.001*basic;
		double Ded=PF+SCF;
		NS=GS-Ded;
	}
		
	void display(){
		super.display();
		
		System.out.println("BP: "+BP);
		System.out.println("DA: "+DA);
		System.out.println("HRA: "+HRA);
		System.out.println("Gross Salary: "+GS);
		System.out.println("PF: "+PF);
		System.out.println("SCF: "+SCF);
		System.out.println("Net Salary: "+NS);
	}
}

class AssociateProfessor extends Employee{
	double BP;
	double DA,GS,NS;
	double HRA,PF,SCF;
	
	AssociateProfessor(double basic){
		BP=basic;
		DA=0.97*basic;HRA=0.1*basic;
		GS=BP+DA+HRA;
		PF=0.12*basic;SCF=0.001*basic;
		double Ded=PF+SCF;
		NS=GS-Ded;
	}
		
	void display(){
		super.display();
		
		System.out.println("BP: "+BP);
		System.out.println("DA: "+DA);
		System.out.println("HRA: "+HRA);
		System.out.println("Gross Salary: "+GS);
		System.out.println("PF: "+PF);
		System.out.println("SCF: "+SCF);
		System.out.println("Net Salary: "+NS);
	}
}

class Professor extends Employee{
	double BP;
	double DA,GS,NS;
	double HRA,PF,SCF;
	
	Professor(double basic){
		BP=basic;
		DA=0.97*basic;HRA=0.1*basic;
		GS=BP+DA+HRA;
		PF=0.12*basic;SCF=0.001*basic;
		double Ded=PF+SCF;
		NS=GS-Ded;
	}
		
	void display(){
		super.display();
		
		System.out.println("BP: "+BP);
		System.out.println("DA: "+DA);
		System.out.println("HRA: "+HRA);
		System.out.println("Gross Salary: "+GS);
		System.out.println("PF: "+PF);
		System.out.println("SCF: "+SCF);
		System.out.println("Net Salary: "+NS);
	}
}

public class PaySlip{
	public static void main(String args[]){
		Programmer prog=new Programmer(1000.0);
		AssistantProfessor asstProf=new AssistantProfessor(10000.0);
		AssociateProfessor assoProf=new AssociateProfessor(50000.0);
		Professor Prof=new Professor(100000.0);
		
		System.out.println("Enter details of Programmer");
		prog.readDetails();
		System.out.println();
		
		System.out.println("Enter details of Assistant Professor");
		asstProf.readDetails();
		System.out.println();
		
		System.out.println("Enter details of Associate Professor");
		assoProf.readDetails();
		System.out.println();
		
		System.out.println("Enter details of Professor");
		Prof.readDetails();
		System.out.println();
		
		System.out.println("Payslip of Programmer ");
		prog.display();
		System.out.println();
		
		System.out.println("Payslip of Assistant Professor ");
		asstProf.display();
		System.out.println();
		
		System.out.println("Payslip of Associate Professor ");
		assoProf.display();
		System.out.println();
		
		System.out.println("Payslip of Professor ");
		Prof.display();	
	}
}	
