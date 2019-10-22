package myPack;

public abstract class Bicycle{
	private int gear,speed;
	
	public Bicycle(int g,int s){
		gear=g;speed=s;
	}
	
	public int getGear(){ return gear;}
	
	public int getSpeed(){ return speed;}
	
	public void setGear(int g){gear=g;}
	
	public void setSpeed(int s){speed=s;}
	
	public abstract void applyBrakes(int x);
	
	public abstract void speedUp(int x);
	
	public abstract double calcPrice();
	
}
