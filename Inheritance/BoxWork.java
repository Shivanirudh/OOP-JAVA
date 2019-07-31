/* 1. Write a java program with a class named ‘Box’ with three parameters length, width and depth.
Inherit a class named ‘BoxWeight’ from ‘Box’ with an additional member weight of the box. Inherit
‘BoxShipment’ from ‘BoxWeight’ with an additional member shipmentcost. Calculate the volume
and cost for the box on shipment.*/

class Box{
	double length;
	double width;
	double depth;

	Box(double x,double y,double z){
		length=x;width=y;depth=z;
	}

}

class BoxWeight extends Box{
	double weight;

	BoxWeight(double x, double y,double z,double w){
		super(x,y,z);
		weight=w;
	}
	double getLength(){return super.length;}
	double getWidth(){return super.width;}
	double getDepth(){return super.depth;}
}

class BoxShipment extends BoxWeight{
	double shipmentCost;

	BoxShipment(double x, double y,double z,double w){
		super(x,y,z,w);
	}

	void calcCost(double rate){
		double vol= super.getLength() * super.getWidth() * super.getDepth();
		shipmentCost=vol*rate;
		System.out.println("Volume :"+vol);		
		System.out.println("Cost :"+shipmentCost);
	}
}

public class BoxWork{
	public static void main(String args[]){
		BoxShipment BS=new BoxShipment(10.0,20.0,30.0,40.0);

		BS.calcCost(2.50);
	}
}
