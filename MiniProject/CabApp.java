import java.util.*;
class PasswordException extends Exception
{
	public String toString()
	{
		return "Incorrect Password!";
	}
}
public class CabApp
{
	public static void main(String args[])
	{
		int choice,dloop=10;
		String dat;
		int atrack=0,dtrack=0,ptrack=0;//To keep track of adding members
		Employee Admin[]=new Employee[100];
		Driver Drivers[]=new Driver[100];
		Passenger Passengers[]=new Passenger[100];
		Scanner x=new Scanner(System.in);
		for(int i=0;i<50;i++)
			System.out.println("\n");
		System.out.println("Welcome to the database creation!");
		while(dloop>-1)
		{
    	 System.out.println("Would you like to add\n1.Admin\n2.Driver\n3.Passenger");
    	 choice=x.nextInt();
    	 if(choice==1)
		{
			Employee admin=new Employee();
			admin.create();
			Admin[atrack++]=admin;
		}
		else if(choice==2)
		{
			Driver driver=new Driver();
			driver.create();
			Drivers[dtrack++]=driver;

		}
		else if(choice==3)
		{
			Passenger passenger=new Passenger();
			passenger.create();
			Passengers[ptrack++]=passenger;
		}
		x.nextLine();
		System.out.println("Would you like to add another?\nYes\nNo?");
        dat=x.nextLine();
        if(dat.equalsIgnoreCase("No"))
        	break;
    	}
    	for(int i=0;i<50;i++)
			System.out.println("\n");
		System.out.println("Loading App!");
		for(int i=0;i<50;i++)
			System.out.println("\n");
		int achoice,dchoice,pchoice;
		do
		{
		System.out.println("Welcome!\nAre you logging in as\n1.Admin\n2.Driver\n3.Passenger\n4.Exit");
		choice=x.nextInt();
		x.nextLine();
		
		
		if(choice==1)
		{

			System.out.println("Enter username: ");
			String nm=x.nextLine();
			int c=-1;
			for(int i=0;i<atrack;i++)
			{
				if(Admin[i].Username.equals(nm))
					{c=i;break;}
			}
			if(c>-1)
			{
				try
				{
				System.out.println("Enter password: ");
			    String pass=x.nextLine();
			    if(!Admin[c].Login(pass))
			    	throw new PasswordException();
			    
			    else
			    {
			     do
			     {
				  System.out.println("What would you like to do?\n1.Look at list of drivers\n2.Add Driver\n3.Change salary\n4.Log out");
				  achoice=x.nextInt();
				  if(achoice==1)
				  {
				  	for(int i=0;i<dtrack;i++)
				  	{
				  		System.out.println("---------------------------");
				  		Drivers[i].display();
				  		System.out.println("---------------------------");
				  	}
				  }
				  else if(achoice==2)
				  {
				  	Driver driver=new Driver();
			        driver.create();
			        Drivers[dtrack++]=driver;

				  }
				  else if(achoice==3)
				  {
				  	System.out.println("Enter name: ");
				  	String n=x.nextLine();
				  	for(int i=0;i<dtrack;i++)
				  	{
				  		if(n.equalsIgnoreCase(Drivers[i].Name))
				  		{
				  			Drivers[i].changeSal();
				  			break;
				  		}

				  	}
				  }
				 }while(achoice!=4);
			    }
			   }
			    catch(PasswordException pw)
			    {
			    	System.out.println(pw.toString());
			    }
			}
		}
		else if(choice==2)
		{
			System.out.println("Enter username: ");
			String nm=x.nextLine();
			int c=-1;
			for(int i=0;i<dtrack;i++)
			{
				if(Drivers[i].Username.equals(nm))
				{

					c=i;
					break;
				}


			}
			if(c>-1)
			{
				try
				{
				System.out.println("Enter password: ");
			    String pass=x.nextLine();
			    if(!Drivers[c].Login(pass))
			    	throw new PasswordException();
			    
			    else
			    {
			    	Random rand=new Random();
			    	int p=rand.nextInt(ptrack);
			    	System.out.println("Welcome "+Drivers[c].Name+"!\nOTP: "+Drivers[c].OTP);
			     do
			     {

				  System.out.println("What would you like to do?\n1.Begin trip\n2.End trip\n3.Passenger Details\n4.Check salary\n5.Log out");
				  dchoice=x.nextInt();
				  if(dchoice==1)
				  {
				  	System.out.print("Enter OTP: ");
				  	int otp=x.nextInt();
				  	if(Drivers[c].checkOTP(otp))
				  	{
				  		Drivers[c].Begin();
				  	}


				  }
				  else if(dchoice==2)
				  {
				  	Drivers[c].End(Passengers[p].name);
				  }
				  else if(dchoice==3)
				  {
				  	Passengers[p].displaypass();
				  }
				  else if(dchoice==4)
				  {
				  	Drivers[c].getSal();
				  }
				 }while(dchoice!=5);
			    }
			}
			    catch(PasswordException pw)
			    {
			    	System.out.println(pw.toString());
			    }
			}
		}
		else if(choice==3)
		{
			System.out.println("Enter Name: ");
			String nm=x.nextLine();
			int c=-1;
			for(int i=0;i<ptrack;i++)
			{
				if(Passengers[i].name.equals(nm))
					{c=i;break;}
			}
			Random rand=new Random();
			//int p=rand.nextInt(dtrack);
			do
			{
				System.out.println("What would you like to do?\n1.Book trip\n2.Cancel Booking\n3.End trip\n4.Driver Details\n5.Log out");
				pchoice=x.nextInt();
				int p=rand.nextInt(dtrack);
				if(pchoice==1)
				{
					Passengers[c].book(Drivers[p]);
				}
				else if(pchoice==2)
				{
					Passengers[c].cancel();

				}
				else if(pchoice==3)
				{
					Passengers[c].End(Drivers[p].Name);
					System.out.println("Please rate your driver out of 5!");
					Drivers[p].rate();
				}
				else if(pchoice==4)
				{
					Passengers[c].checkDriver(Drivers[p]);
				}
			}while(pchoice!=5);
		}
	  }while(choice!=4);



	}
}