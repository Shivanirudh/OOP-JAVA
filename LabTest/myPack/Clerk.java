package myPack;
/*
class Engineer{
	private String name;
	private int age;
	private String degree;
	private double basic;
	
	public Engineer(String n,int a,String d,double b){
		this.name=n;
		this.age=a;
		this.degree=d;
		this.basic=b;
	}
	
	public String getName(){ return name;}
	public int getAge(){ return age;}
	public String getDegree(){ return degree;}
	public double getBasic(){ return basic;}
}*/

import myPack.*;
public class Clerk extends myPack.Engineer{
	private double speed;
	
	public Clerk(String n,int a,String d,double b,double s){
		super(n,a,d,b);
		this.speed=s;
	}
	
	public double getSpeed(){ return speed; }
	
	public double calSalary(){
		double sal=0;
		double b=super.getBasic();
		sal=(b+(0.5*b)+(0.05*b)-(0.4*b));
		return sal;
	}
}
