import java.util.*;
import java.lang.*;
import myPack.*;

public class BicycleDemo{
	public static void main(String args[]){
		int g,s,h,w;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println("Enter details for Mountain Bike: ");
		System.out.println("-----------------------------------------");
		System.out.print("Enter number of gears: ");g=in.nextInt();
		System.out.print("Enter speed: ");s=in.nextInt();
		System.out.print("Enter seat height: ");h=in.nextInt();
		
		MountainBike mb=new MountainBike(g,s,h);
		
		System.out.println();
		System.out.println("Gears: "+mb.getGear());
		System.out.println("Speed: "+mb.getSpeed());
		System.out.println("Seat Height: "+mb.getHeight());
		System.out.println("Price: "+mb.calcPrice());
		System.out.println();
		
		int option=0;
		do{
			System.out.println("Speed Control");
			System.out.println("Perform?");
			System.out.println("1.Apply Brakes");
			System.out.println("2.Speed Up");
			System.out.print("Choice: ");option=in.nextInt();
			
			if(option==1){
				System.out.println();
				System.out.println("Current Speed"+ mb.getSpeed());
				int x;
				System.out.println("Enter value to reduce by: ");
				x=in.nextInt();
				mb.applyBrakes(x);
				System.out.println("New Speed"+mb.getSpeed());
				System.out.println();
			}
			else if(option==2){
				System.out.println();
				System.out.println("Current Speed"+ mb.getSpeed());
				int x;
				System.out.println("Enter value to increase by: ");
				x=in.nextInt();
				mb.speedUp(x);
				System.out.println("New Speed"+mb.getSpeed());
				System.out.println();
			}
			else if(option==0){
				System.out.println();
				System.out.println("Gears: "+mb.getGear());
				System.out.println("Speed: "+mb.getSpeed());
				System.out.println("Seat Height: "+mb.getHeight());
				System.out.println("Price: "+mb.calcPrice());
				System.out.println();
			}
			else{
				System.out.println("Invalid input");
			}
		}while(option!=0);
		
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println("Enter details for All Terrain Bike: ");
		System.out.println("-----------------------------------------");
		System.out.print("Enter number of gears: ");g=in.nextInt();
		System.out.print("Enter speed: ");s=in.nextInt();
		System.out.print("Enter seat height: ");h=in.nextInt();
		System.out.print("Enter tyre width: ");w=in.nextInt();
		
		AllTerrainBike atb=new AllTerrainBike(g,s,h,w);
		
		System.out.println();
		System.out.println("Gears: "+atb.getGear());
		System.out.println("Speed: "+atb.getSpeed());
		System.out.println("Seat Height: "+atb.getHeight());
		System.out.println("Tyre Width: "+atb.getWidth());
		System.out.println("Price: "+atb.calcPrice());
		System.out.println();
		
		option=0;
		do{
			System.out.println("Speed Control");
			System.out.println("Perform?");
			System.out.println("1.Apply Brakes");
			System.out.println("2.Speed Up");
			System.out.print("Choice: ");option=in.nextInt();
			
			if(option==1){
				System.out.println();
				System.out.println("Current Speed"+ atb.getSpeed());
				int x;
				System.out.println("Enter value to reduce by: ");
				x=in.nextInt();
				atb.applyBrakes(x);
				System.out.println("New Speed"+atb.getSpeed());
				System.out.println();
			}
			else if(option==2){
				System.out.println();
				System.out.println("Current Speed"+ atb.getSpeed());
				int x;
				System.out.println("Enter value to increase by: ");
				x=in.nextInt();
				atb.speedUp(x);
				System.out.println("New Speed"+atb.getSpeed());
				System.out.println();
			}
			else if(option==0){
				System.out.println();
				System.out.println("Gears: "+atb.getGear());
				System.out.println("Speed: "+atb.getSpeed());
				System.out.println("Seat Height: "+atb.getHeight());
				System.out.println("Tyre Width: "+atb.getWidth());
				System.out.println("Price: "+atb.calcPrice());
				System.out.println();
			}
			else{
				System.out.println("Invalid input");
			}
		}while(option!=0);
	}
}
	
