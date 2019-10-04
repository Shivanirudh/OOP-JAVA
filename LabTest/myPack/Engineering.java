package myPack;
/*
class InvalidBasicException extends Exception{
	
	public String toString(){
		return "InvalidBasicException: ";
	}
}
*/
public class Engineer{
	private String name;
	private int age;
	private String degree;
	private double basic;
	
	Engineer(String n,int a,String d,double b){
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
/*
class Technician extends Engineer{
	private String skill;
	
	Technician(String n,int a,String d,double b,String s) throws InvalidBasicException{
		super(n,a,d,b);
		if(b<5000.0||b>30000.0){
			throw new InvalidBasicException();
		}
		else{
			
			this.skill=s;
		}
	}
	
	String getSkill(){return skill;}
	
	double calSalary(){
		double sal=0;
		double b=getBasic();
		sal=(b+(0.6*b)+(0.1*b)-(0.4*b));
		return sal;
	}
}

class Clerk extends Engineer{
	double speed;
	
	Clerk(String n,int a,String d,double b,double s)throws InvalidBasicException{
		super(n,a,d,b);
		if(b<5000.0||b>30000.0){
			throw new InvalidBasicException();
		}
		else{
			
			this.speed=s;
		}
	}
	
	double getSpeed(){ return speed; }
	
	double calSalary(){
		double sal=0;
		double b=getBasic();
		sal=(b+(0.5*b)+(0.05*b)-(0.4*b));
		return sal;
	}
}


		 */
