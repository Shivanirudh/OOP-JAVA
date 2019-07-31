/*3. Write a Java program with a class named ‘Person’ which consists of name, age, DOB and
address. Have functions to get input and calculate_performance. Derive a class named ‘Student’
from ‘Person’ class with additional members like department, marks, extra-curricular. Calculate
performance of Student (Outstanding, Excellent, Good, Fair) based on the grade and extra-
curricular activities. Derive a class named ‘Professor’ from ‘Person’ with additional members like
department, number of publications and funded projects. Calculate performance of Professor based
on the number of publications and funded projects. In main get ‘n’ number of Persons' information
and calculate the performance.*/

import java.util.Scanner;

abstract class Person{
	String name;
	int age;
	int DOB[]=new int[3];
	String Address;
	
	public void readDetails(){
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Name :");name=in.nextLine();
		System.out.print("Enter age :");age=in.nextInt();
		System.out.print("Enter Address :");Address=in.nextLine(); in.nextLine();
		System.out.print("Enter DOB :");DOB[0]=in.nextInt();DOB[1]=in.nextInt();DOB[2]=in.nextInt();
	}
	
	abstract void calcPerformance();
}

class Student extends Person{
	String dept;
	double m1,m2,m3,total;
	char grade;
	String extraCurricular;
	
	public void getDetails(){
		super.readDetails();
		Scanner in=new Scanner(System.in);
		System.out.print("Enter department :");dept=in.nextLine();
		System.out.print("Enter marks :");m1=in.nextDouble();m2=in.nextDouble();m3=in.nextDouble();in.nextLine();
		System.out.print("Any Extracurricular?(Yes/No)");extraCurricular=in.nextLine();
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
		else
			grade='F';
	}
	
	void calcPerformance(){
		if(extraCurricular.equals("Yes")){
			if(grade=='O'||grade=='A')
				System.out.println("Outstanding");
			else if(grade=='B')
				System.out.println("Excellent");
			else if(grade=='C')
				System.out.println("Good");
			else 
				System.out.println("Fair");
		}
		else{
			if(grade=='O')
				System.out.println("Outstanding");
			else if(grade=='A')
				System.out.println("Excellent");
			else if(grade=='B')
				System.out.println("Good");
			else
				System.out.println("Fair");
		}
	}
}

class Professor extends Person{
	String dept;
	int noPub;
	int noFP;
	
	public void getDetails(){
		super.readDetails();
		Scanner in=new Scanner(System.in);
		System.out.print("Enter department :");dept=in.nextLine();
		System.out.print("Enter number of publications :");noPub=in.nextInt();
		System.out.print("Enter number of funded projects :");noFP=in.nextInt();
	}
	
	void calcPerformance(){
		int sum=noPub+noFP;
		
		if(sum>15)
			System.out.println("Outstanding");
		else if(sum>10)
			System.out.println("Excellent");
		else if(sum>7)
			System.out.println("Good");
		else
			System.out.println("Fair");
	}
}

public class Judgement{
	public static void main(String args[]){
		int SnumLimit,PnumLimit;
		
		Student s=new Student();
		Professor p=new Professor();
		
		Scanner in=new Scanner(System.in);
		System.out.print("Enter number of students");SnumLimit=in.nextInt();
		System.out.print("Enter number of professors");PnumLimit=in.nextInt();
		
		System.out.println("Enter details of students: "); 
		for(int i=0;i<SnumLimit;i++){
			s.getDetails();
			s.calcPerformance();
		}
		
		System.out.println("Enter details of professors: "); 
		for(int i=0;i<PnumLimit;i++){
			p.getDetails();
			p.calcPerformance();
		}
	}
}
