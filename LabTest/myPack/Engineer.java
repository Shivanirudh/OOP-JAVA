package myPack;

public class Engineer{
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
}
	 
