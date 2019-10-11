import java.util.*;
class Employee
{
 String Username;
 private String Password;
 String Name;
 int ID;
 double Salary;
 boolean Login(String pass)
 {
 	if(this.Password.equals(pass))
 	{
 		return true;
 	}
 	else
 	{
 		return false;
 	}
 }
 void create()
 {
 	Scanner x=new Scanner(System.in);
 	Random rand=new Random();
 	System.out.println("Enter Username: ");
 	this.Username=x.nextLine();
 	System.out.println("Enter Password: ");
 	this.Password=x.nextLine();
 	System.out.println("Enter Name: ");
 	this.Name=x.nextLine();
 	System.out.println("Enter Salary: ");
 	this.Salary=x.nextDouble();
 	int y=rand.nextInt(1000000);
 	y+=1000000;
 	this.ID=y;
 }

}
