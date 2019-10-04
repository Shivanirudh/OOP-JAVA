
import myPack.*;
public class Clerk extends myPack.Engineer{
	private double speed;
	
	public Clerk(String n,int a,String d,double b,double s)  throws myPack.InvalidBasicException{
		super(n,a,d,b);
		if(b<5000.0||b>30000.0){
			throw new myPack.InvalidBasicException();
		}
		else{
			this.speed=s;
		}
	}
	
	public double getSpeed(){ return speed; }
	
	public double calSalary(){
		double sal=0;
		double b=super.getBasic();
		sal=(b+(0.5*b)+(0.05*b)-(0.4*b));
		return sal;
	}
}
