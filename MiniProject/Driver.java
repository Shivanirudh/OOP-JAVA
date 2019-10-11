import java.util.*;
public class Driver extends Employee implements Trip
{
	String vehicle;
	int license;
	int trip;
	int rating;
	int OTP;
    void create()
	{
		super.create();
		Scanner x=new Scanner(System.in);
		System.out.println("Enter Vandi model: ");
		this.vehicle=x.nextLine();
		System.out.println("Enter Vandi number: ");
		this.license=x.nextInt();
		this.rating=5;
		Random rand=new Random();
		this.OTP=rand.nextInt(8999);
		OTP+=1000;

	}
	void display()
	{
		System.out.println(this.Name);
		System.out.println(this.vehicle);
		System.out.println(this.license);
		System.out.println("Rating: "+this.rating);
	}
	public void Begin()
	{
		System.out.print("You are on your way!");
	}
	//deleted
	public void End(String n)
	{
		System.out.println("You have dropped off  "+n+" at their destination!");
	}
	void rate()
	{
		Scanner x=new Scanner(System.in);
	
		int y=x.nextInt();
		this.rating=(this.rating+y)/2;

	}
	void getSal()
	{
		System.out.println("Salary is: "+this.Salary);
	}	//deleted
	void changeSal()
	{
		Scanner x=new Scanner(System.in);
		System.out.println("Enter new Salary: ");
		this.Salary=x.nextDouble();
	}
	boolean checkOTP(int x)
	{
		if(this.OTP==x)
			return true;
		else
			return false;

	}


}
interface Trip
{
	void Begin();
	void End(String n);
}