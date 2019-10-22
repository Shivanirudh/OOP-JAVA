package myPack;
//import myPack.*;

public class AllTerrainBike extends MountainBike{
	private int tyreWidth;
	
	public AllTerrainBike(int g,int s,int h,int w){
		super(g,s,h);
		tyreWidth=w;
	}
	
	public int getWidth(){ return tyreWidth;}
	
	public void setWidth(int w){ tyreWidth=w;}
	
	public void applyBrakes(int x){
		setSpeed(getSpeed()-x);
	}
	
	public void speedUp(int x){
		setSpeed(getSpeed()+x);
	}
	
	public double calcPrice(){
		return getGear()*1500;
	}
}
