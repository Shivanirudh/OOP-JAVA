import java.util.Scanner;


class StudentDetails{
	int regno;
	String name;
	String dept;
	double m1,m2,m3;
	double total;
	char grade;
	
	public void readDetails(){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Register Number :");regno=in.nextInt();
		System.out.print("Enter Name :");name=in.nextLine();
		System.out.print("Enter Department :");dept=in.nextLine();
		System.out.print("Enter Marks :");m1=in.nextDouble();m2=in.nextDouble(); m3=in.nextDouble();
	}

	public void calcTotal(){
		total= m1+m2+m3;
	}
	
	public void calcGrade(){
		if(total>90.0)
			grade='O';
		else if(total>80.0)
			grade='A';
		else if(total>70.0)
			grade='B';
		else if(total>60.0)
			grade='C';
		else if(total>50.0)
			grade='D';
	}
	
	public void display(){
		System.out.println("Register Number :"+regno);
		System.out.println("Name :"+name);
		System.out.println("Department :"+dept);
		System.out.println("Marks :"+m1+" "+m2+" "+m3);
		System.out.println("Total :"+total);
		System.out.println("Grade :"+grade);
	}
	
}

public class Student{

	public static void searchStudent(StudentDetails sd[],int id){
		for(int i=0;i<sd.length;i++)
			if(id==sd[i].regno)
				sd[i].display();
	}
	
	public static void searchStudent(StudentDetails sd[],String dept){
		for(int i=0;i<sd.length;i++)
			if(dept.equals(sd[i].dept))
				sd[i].display();
	}
	
	public static void main(String args[]){
		StudentDetails sd[]=new StudentDetails[100];
		Scanner in=new Scanner(System.in);
		int numLimit;
		
		System.out.print("Enter number of students ");numLimit=in.nextInt();
		
		System.out.print("Enter the details\n");
		for(int i=0;i<numLimit;i++){
			System.out.println("Student "+(i+1));
			sd[i].readDetails();
		}
		
		for(int i=0;i<numLimit;i++){
			sd[i].calcTotal();
			sd[i].calcGrade();
		}
		
		int id;
		String dept;
		
		System.out.print("Enter id to search for");id=in.nextInt();
		searchStudent(sd,id);
		
		System.out.print("Enter department to search for");dept=in.nextLine();
		searchStudent(sd,dept);
	
	}
}
