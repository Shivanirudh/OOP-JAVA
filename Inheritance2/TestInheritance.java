import java.util.Scanner;

class Person{
	private int aadhaar;
	private String name;
	private String address;
	private char gender;
	
	//Constructor
	public Person(int aadhaar,String name,String address,char gender){
		this.aadhaar=aadhaar;
		this.name=name;
		this.address=address;
		this.gender=gender;
	}
	
	//Return Aadhaar
	public int getAadhaar(){       
		return aadhaar;
	}
	
	//Return Name
	public String getName(){
		return name;
	}
	
	//Return Address
	public String getAddress(){
		return address;
	}
	
	//Set Address
	public void setAddress(String address){
		this.address=address;
	}
	
	//Return Gender
	public char getGender(){
		return gender;
	}
	
}

class Student extends Person{
	private String program;
	private int year;
	private float totalmark;
	
	public Student(int aadhaar,String name,String address,char gender,String program,int year,float total){
		super(aadhaar,name,address,gender);
		this.program=program;
		this.year=year;
		this.totalmark=total;
	}
	
	//Return Program
	public String getProgram(){
		return program;
	}
	
	//Return year
	public int getYear(){
		return year;
	}
	
	//Set Year
	public void setYear(int year){
		this.year=year;
	}
	
	//Return Total
	public float getTotal(){
		return totalmark;
	}
	
	//Set Total
	public void setTotal(float tot){
		this.totalmark=tot;
	}
	
	//Return GPA
	public float calGPA(){
		return totalmark/10;
	}
}

class Faculty extends Person{
	private String designation;
	private String department;
	private double basicpay;
	
	public Faculty(int aadhaar,String name,String address,char gender,String designation,String department,double basicpay){
		super(aadhaar,name,address,gender);
		this.designation=designation;
		this.department=department;
		this.basicpay=basicpay;
	}
	
	//Return Designation
	public String getDesig(){
		return designation;
	}
	
	//Return Department
	public String getDept(){
		return department;
	}
	
	//Set Designation
	public void setDesig(String desig){
		designation=desig;
	}
	
	//Set Basic Pay
	public void setBasic(double basic){
		basicpay=basic;
	}
	
	//Return Basic Pay
	public double getBasic(){
		return basicpay;
	}
	
	//Return Salary
	public double calSalary(){
		double GP,Ded,NP;
		GP=basicpay+(0.6*basicpay)+(0.1*basicpay);
		Ded=(0.085*basicpay)+(0.08*basicpay);
		NP=GP-Ded;
		return NP;
	}
	
}

public class TestInheritance{
	public static void main(String args[]){
		int aadhaar;
		String name=new String();
		String address=new String();
		char gender;
		String program=new String();
		int year;
		float totalmark;
		String designation=new String();
		String department=new String();
		double basicpay;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Student Details: ");
		System.out.print("Enter name: ");name=in.nextLine();
		System.out.print("Enter aadhaar number: ");aadhaar=in.nextInt();
		in.nextLine();
		System.out.print("Enter address: ");address=in.nextLine();		
		System.out.print("Enter gender: ");gender=in.next().charAt(0);
		in.nextLine();
		System.out.print("Enter program: ");program=in.nextLine();
		System.out.print("Enter year: ");year=in.nextInt();
		System.out.print("Enter total marks: ");totalmark=in.nextFloat();
		in.nextLine();
		Student s=new Student(aadhaar,name,address,gender,program,year,totalmark);
		
		System.out.println("Enter Faculty Details: ");
		System.out.print("Enter name: ");name=in.nextLine();
		System.out.print("Enter aadhaar number: ");aadhaar=in.nextInt();
		in.nextLine();		
		System.out.print("Enter address: ");address=in.nextLine();	
		System.out.print("Enter gender: ");gender=in.next().charAt(0);
		in.nextLine();		
		System.out.print("Enter designation: ");designation=in.nextLine();
		System.out.print("Enter department: ");department=in.nextLine();
		System.out.print("Enter basic pay: ");basicpay=in.nextDouble();
		
		Faculty f=new Faculty(aadhaar,name,address,gender,designation,department,basicpay);
		
		System.out.println("Student Details: ");
		System.out.println("Name: "+s.getName());
		System.out.println("Aadhar: "+s.getAadhaar());
		System.out.println("Address: "+s.getAddress());
		System.out.println("Gender: "+s.getGender());
		System.out.println("Program: "+s.getProgram());
		System.out.println("Year: "+s.getYear());
		System.out.println("Total Marks: "+s.getTotal());
		System.out.println("GPA: "+s.calGPA());
		
		System.out.println();
		
		System.out.println("Faculty Details: ");
		System.out.println("Name: "+f.getName());
		System.out.println("Aadhar: "+f.getAadhaar());
		System.out.println("Address: "+f.getAddress());
		System.out.println("Gender: "+f.getGender());
		System.out.println("Designation: "+f.getDesig());
		System.out.println("Department: "+f.getDept());
		System.out.println("Salary: "+f.calSalary());
		
	}
}

/*
Output:

Enter Student Details: 
Enter name: A
Enter aadhaar number: 1234
Enter address: asdf
Enter gender: m
Enter program: sdfg
Enter year: 2 
Enter total marks: 98.5
Enter Faculty Details: 
Enter name: B
Enter aadhaar number: 9876
Enter address: lkjh
Enter gender: f
Enter designation: kjhg
Enter department: mnbv
Enter basic pay: 2000.0
Student Details: 
Name: A
Aadhar: 1234
Address: asdf
Gender: m
Program: sdfg
Year: 2
Total Marks: 98.5
GPA: 9.85

Faculty Details: 
Name: B
Aadhar: 9876
Address: lkjh
Gender: f
Designation: kjhg
Department: mnbv
Salary: 3070.0

*/
