import java.util.*;
import myPack.*;

public class Test{
	public static void main(String args[]){
		
		Scanner in=new Scanner(System.in);
		
		String name,degree,skill;
		int age;
		double basic,speed;
		do{
			System.out.println("\nEnter Technician's details ");
			System.out.print("\nEnter the name : ");name=in.nextLine();
			System.out.print("\nEnter the age : ");age=in.nextInt();
			in.nextLine();
			System.out.print("\nEnter the degree : ");degree=in.nextLine();
			System.out.print("\nEnter the basic pay : ");basic=in.nextDouble();
			in.nextLine();
			System.out.print("\nEnter the skill : ");skill=in.nextLine();
			
			try{
				if(basic<5000.0||basic>30000.0)
					throw new myPack.InvalidBasicException();
				Technician t=new Technician(name,age,degree,basic,skill);
				System.out.println("\n Technician's details ");
				System.out.println("Name: "+t.getName());
				System.out.println("Age: "+t.getAge());
				System.out.println("Degree: "+t.getDegree());
				System.out.println("Skill: "+t.getSkill());
				System.out.println("Salary: "+t.calSalary());
			}
			catch(myPack.InvalidBasicException ibe){
				if(basic<5000){
					System.out.println(ibe.toString() +"Basic pay below 5000");
					System.out.println("Please re-enter details");
				}
				else{ 
					System.out.println(ibe.toString() +"Basic pay above 30000");
					System.out.println("Please re-enter details");
				}
			}
		}while(basic<5000||basic>30000);
		
		do{
			System.out.println("\nEnter Clerk's details ");
			System.out.print("\nEnter the name : ");name=in.nextLine();
			System.out.print("\nEnter the age : ");age=in.nextInt();
			in.nextLine();
			System.out.print("\nEnter the degree : ");degree=in.nextLine();
			System.out.print("\nEnter the basic pay : ");basic=in.nextDouble();
			System.out.print("\nEnter the typing speed : ");speed=in.nextDouble();
			
			try{
				if(basic<5000.0||basic>30000.0)
					throw new myPack.InvalidBasicException();
				Clerk c=new Clerk(name,age,degree,basic,speed);
				System.out.println("\n Clerk's details ");
				System.out.println("Name: "+c.getName());
				System.out.println("Age: "+c.getAge());
				System.out.println("Degree: "+c.getDegree());
				System.out.println("Typing speed: "+c.getSpeed());
				System.out.println("Salary: "+c.calSalary());
			}
			catch(myPack.InvalidBasicException ibe){
				if(basic<5000){
					System.out.println(ibe.toString() +"Basic pay below 5000");
					System.out.println("Please re-enter details");
				}
				else{ 
					System.out.println(ibe.toString() +"Basic pay above 30000");
					System.out.println("Please re-enter details");
				}
			}
		}while(basic<5000||basic>30000);
	}
}
