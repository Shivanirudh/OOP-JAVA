import java.util.Scanner;

class Person{
	private String name;
	private String address;
	
	public Person(String name,String address){
		this.name=name;
		this.address=address;
	}
	
	public String getName(){ return name; }
	
	public String getAddress(){return address;}
	
	public void setAddress(String address){
		this.address=address;
	}
}

class Employee extends Person{
	private String empid;
	private String dept;
	private int basic;
	
	public Employee(String name,String address,String empid,String dept,int basic){
		super(name,address);
		this.empid=empid;
		this.dept=dept;
		this.basic=basic;
	}
	
	public String getEmpid(){ return empid; }
	
	public String getDept(){ return dept; }
	
	public void setDept(String dept){
		this.dept=dept;
	}
	
	public void setBasic(int basic){
		this.basic=basic;
	}
	
	public double getBasic(){ return basic; }
	
	public double calSalary(){ 
		return 1.535*getBasic();
	}
	
}

class Faculty extends Employee{
	String designation;
	String course;
	
	public Faculty(String name,String address,String empid,String dept,int basic,String desig,String course){
		super(name,address,empid,dept,basic);
		this.designation=desig;
		this.course=course;
	}
	
	public String getDesig(){ return designation; }
	
	public void setDesig(String desig){
		this.designation=desig;
	}
	
	public void setCourse(String course){
		this.course=course;
	}
	
	public String getCourse(){ return course; }
	
	public double calSalary(){
		return 1.535*getBasic();
	}
}

interface Student{
	double[] getMarks();
	double calcGPA();
}

class ResearchAssisstant extends Employee implements Student{
	private String project;	
	private String course;
	
	public ResearchAssisstant(String name,String address,String empid,String dept,int basic, String project,String course ){
		super(name,address,empid,dept,basic);
		this.project=project;
		this.course=course;
	}
	
	public String getProject(){ return project; }
	
	public String getCourse(){ return course; }
	
	public void setCourse(String course){
		this.course=course;
	}
	
	public double[] getMarks(){
		Scanner in=new Scanner(System.in);
		
		double marks[]=new double[3];
		
		System.out.println("Enter the marks ");
		for(int i=0;i<3;i++)
			marks[i]=in.nextDouble();
		
		return marks;
	}
	
	public double calcGPA(){
		double marks[]=new double[3];
		marks=getMarks();
		double sum=0;
		for	(int i=0;i<3;i++)
			sum+=marks[i];
			
		double avg=sum/3;
		
		return avg/100;
	}
	
	public double calSalary(){
		return 1.535*getBasic();
	}
}

public class TestPerson{
	public static void main(String args[]){
	
		String name,address,empid,dept,project,course;
		int basic;
		double GPA;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the Research Assisstant details ");
		System.out.print("Enter name: ");name=in.nextLine();
		System.out.print("Enter address: ");address=in.nextLine();
		System.out.print("Enter empid: ");empid=in.nextLine();
		System.out.print("Enter department: ");dept=in.nextLine();
		System.out.print("Enter project: ");project=in.nextLine();
		System.out.print("Enter course: ");course=in.nextLine();
		System.out.print("Enter basic: ");basic=in.nextInt();
		
		
		ResearchAssisstant ra=new ResearchAssisstant(name,address,empid,dept,basic,project,course);
		GPA=ra.calcGPA();
		
		System.out.println("\n\nResearch Assisstant details ");
		System.out.println("Name: "+ra.getName());
		System.out.println("Address: "+ra.getAddress());
		System.out.println("Employee ID: "+ra.getEmpid());
		System.out.println("Department: "+ra.getDept());
		System.out.println("Project: "+ra.getProject());
		System.out.println("Course: "+ra.getCourse());
		System.out.println("Salary: "+ra.calSalary());
		System.out.println("GPA: "+GPA);
	}
	
}

/*
Output:
Enter the Research Assisstant details 
Enter name: a
Enter address: a
Enter empid: 1
Enter department: cse
Enter project: asdfgf
Enter course: ;lkjhj
Enter basic: 10000
Enter the marks 
95 84 93


Research Assisstant details 
Name: a
Address: a
Employee ID: 1
Department: cse
Project: asdfgf
Course: ;lkjhj
Salary: 15350.0
GPA: 0.9066666666666667
*/
