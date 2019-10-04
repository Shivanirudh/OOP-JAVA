import myPack.*;

public class Technician extends Engineer{
	private String skill;
	
	public Technician(String n,int a,String d,double b,String s){
		super(n,a,d,b);
		this.skill=s;
	}
	
	public String getSkill(){return skill;}
	
	public double calSalary(){
		double sal=0;
		double b=super.getBasic();
		sal=(b+(0.6*b)+(0.1*b)-(0.4*b));
		return sal;
	}
}
