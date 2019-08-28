import java.util.Scanner;

class PanRequiredException extends Exception{
	public String toString(){
		return "PanRequiredException: PAN Number Required";
	}
}

class MinBalRequiredException extends Exception{
	public String toString(){
		return "MinBalRequiredException: Balance Tending Below Minimum Limit";
	}
}

class NotEnoughMoneyInAccountException extends Exception{
	public String toString(){
		return "NotEnoughMoneyInAccountException: Insufficient Funds To Process  Request";
	}
}

class AccountNotFoundException extends Exception{
	public String toString(){
		return "AccountNotFoundException: Requested Account Non-Existent";
	}
}

class Account{
	private String cname;
	private int pan;
	private int accno;
	private String branch;
	private double balance;
	
	public Account(String cname,int pan,int accno,String branch,double balance){
		this.cname=cname;
		this.pan=pan;
		this.accno=accno;
		this.branch=branch;
		this.balance=balance;
	}
	
	public String getCName(){return cname;}
	public int getPAN(){return pan;}
	public int getAccNo(){return accno;}
	public String getBranch(){return branch;}
	public double getBalance(){return balance;}
	
	public void deposit(int accno,double amt) throws PanRequiredException{
		if(amt>50000)
			throw new PanRequiredException();
		else
			balance+=amt;
	}
	
	public void withdraw(int accno,double amt) throws MinBalRequiredException,NotEnoughMoneyInAccountException{
		if(balance<amt)
			throw new NotEnoughMoneyInAccountException();
		else if((balance-amt)<1000.0)
			throw new MinBalRequiredException();
		else 
			balance-=amt;
	}

	public void search(int accno)throws AccountNotFoundException{
		if(this.accno==accno){
			System.out.println("\nName: "+cname);
			System.out.println("PAN: "+pan);
			System.out.println("Account Number: "+accno);
			System.out.println("Branch: "+branch);
			System.out.println("Current Balance: "+balance);
		}
		else
			throw new AccountNotFoundException();
	}

	public String toString(){
		return "Account Number "+accno+" has produced ";
	}
}

public class AccountHandling{
	public static void main(String args[]){
		
		String name,branch;
		int pin,accno;
		double bal;
		int num;
		double amt;
		int ano;
		int opt;
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("\nEnter limit ");num=in.nextInt();
		
		Account acc[]=new Account[100];
		for(int i=0;i<num;i++){
			System.out.println("Enter Account Details ");
			in.nextLine();
			System.out.print("Enter Name: ");name=in.nextLine();
			System.out.print("Enter PIN number: ");pin=in.nextInt();
			System.out.print("Enter Account number: ");accno=in.nextInt();
			in.nextLine();
			System.out.print("Enter Branch: ");branch=in.nextLine();
			System.out.print("Enter Balance: ");bal=in.nextDouble();

			acc[i]=new Account(name,pin,accno,branch,bal);
		}
		
		do{
			
		
			System.out.println("\nWhat do? \n 1-Deposit\n 2-Withdraw");
			System.out.println(" 0-Exit");
			System.out.print(" Your choice: ");	opt=in.nextInt();
			
			if(opt==1){
				System.out.print("Enter amount to deposit: ");
				amt=in.nextDouble();
				System.out.print("Enter account number: ");
				ano=in.nextInt();
				
				for(int i=0;i<num;i++){
					try{
						acc[i].search(ano);
						try{
							acc[i].deposit(ano,amt);
							System.out.println("\nAfter deposit ");
							acc[i].search(ano);
							break;
						}
						catch(PanRequiredException pre){
							System.out.println(acc[i].toString()+pre.toString());break;
						}
					}
					catch(AccountNotFoundException anfe){
						System.out.println(acc[i].toString()+anfe.toString());
					}
				}
			}
			else if(opt==2){
				System.out.print("Enter amount to withdraw: ");
				amt=in.nextDouble();
				System.out.print("Enter account number: ");
				ano=in.nextInt();
				
				for(int i=0;i<num;i++){
					try{
						acc[i].search(ano);
						try{
							acc[i].withdraw(ano,amt);
							System.out.println("After deposit ");
							acc[i].search(ano);
							break;
						}
						catch(MinBalRequiredException pre){
							System.out.println(acc[i].toString()+pre.toString());break;
						}
						catch(NotEnoughMoneyInAccountException nemiae){
							System.out.println(acc[i].toString()+nemiae.toString());break;
						}
					}
					catch(AccountNotFoundException anfe){
						System.out.println(acc[i].toString()+anfe.toString());
					}
				}
			}
			else if(opt!=0)
				System.out.println("Invalid option ");
		}while(opt!=0);		
	}
}	

/*
Output:
Enter limit 3
Enter Account Details 
Enter Name: 1
Enter PIN number: 1
Enter Account number: 1
Enter Branch: 1
Enter Balance: 50000
Enter Account Details 
Enter Name: 2
Enter PIN number: 2
Enter Account number: 2
Enter Branch: 2
Enter Balance: 200000 
Enter Account Details 
Enter Name: 3
Enter PIN number: 3
Enter Account number: 3
Enter Branch: 3
Enter Balance: 150000

What do? 
 1-Deposit
 2-Withdraw
 0-Exit
 Your choice: 1
Enter amount to deposit: 10000
Enter account number: 1

Name: 1
PAN: 1
Account Number: 1
Branch: 1
Current Balance: 50000.0

After deposit 

Name: 1
PAN: 1
Account Number: 1
Branch: 1
Current Balance: 60000.0

What do? 
 1-Deposit
 2-Withdraw
 0-Exit
 Your choice: 2
Enter amount to withdraw: 70000
Enter account number: 1

Name: 1
PAN: 1
Account Number: 1
Branch: 1
Current Balance: 60000.0
Account Number 1 has produced NotEnoughMoneyInAccountException: Insufficient Funds To Process  Request

What do? 
 1-Deposit
 2-Withdraw
 0-Exit
 Your choice: 2
Enter amount to withdraw: 59500
Enter account number: 1

Name: 1
PAN: 1
Account Number: 1
Branch: 1
Current Balance: 60000.0
Account Number 1 has produced MinBalRequiredException: Balance Tending Below Minimum Limit

What do? 
 1-Deposit
 2-Withdraw
 0-Exit
 Your choice: 0
*/
