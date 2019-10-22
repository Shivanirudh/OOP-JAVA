package myPack;
//import myPack.*;

public class MountainBike extends Bicycle{
	private int seatHeight;
	
	public MountainBike(int g,int s,int h){
		super(g,s);
		seatHeight=h;
	}
	
	public int getHeight(){ return seatHeight;}
	
	public void setHeight(int h){ seatHeight=h;}
	
	public void applyBrakes(int x){
		setSpeed(getSpeed()-x);
	}
	
	public void speedUp(int x){
		setSpeed(getSpeed()+x);
	}
	
	public double calcPrice(){
		return getGear()*1000;
	}
}
	
