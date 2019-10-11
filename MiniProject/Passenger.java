import java.util.*;
public class Passenger implements Trip
{
	String name;
	String home;
	String number;
	int trip=0;
	void create()
	{
		Scanner x=new Scanner(System.in);
		System.out.print("Enter your name: ");
		this.name=x.nextLine();
		System.out.print("Enter your home address: ");
		this.home=x.nextLine();
		System.out.print("Enter your phone number: ");
		this.number=x.nextLine();
		
	}
    void checkDriver(Driver d)
    {
    	System.out.println("Name: "+d.Name);
    	System.out.println("Vehicle: "+d.vehicle);
    	System.out.println("License: "+d.license);
    }
    void book(Driver D)
    {
    	System.out.println(D.Name+" will be arriving shortly");
    	System.out.println("\n");
    	this.trip=1;

    }
    void cancel()
    {
    	System.out.println("Are you sure you want to cancel?\nYes/No?");
    	Scanner x=new Scanner(System.in);
    	String choice=x.nextLine();
    	if(choice.equalsIgnoreCase("Yes"))
    	{
    		this.trip=0;
    		//D.trip=0;
    	}
    }
    //deleted
    public void Begin( )
    {
    	Scanner x=new Scanner(System.in);
    	System.out.println("Would you like to begin the trip?\nYes/No?");
    	String choice=x.nextLine();
    	if(choice.equalsIgnoreCase("Yes"))
    	{
    		this.trip=1;
    	    //D.trip=1;
    	}
    }
    public void End(String n)
    {
    	Random rand=new Random();
    	int x=rand.nextInt(500);
    	x+=30;
    	System.out.println("Please pay "+n+" Rs."+x);
    	this.trip=0;
    	
    }
    void displaypass()
    {
    	System.out.println(this.name);
    	System.out.println(this.home);
    	System.out.println(this.number);
    }




}