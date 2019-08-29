import java.util.Scanner;

public class NumberGuess{
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);			
		double Answer,Guess;int NoAttempts=0;
		
		double Initial=Math.random()*100;
		Answer=(int)Initial;
		
		System.out.print("Enter your guess: ");
		do{
			NoAttempts++;
			Guess=obj.nextInt();
			if(Guess<Answer)
				System.out.println("Try higher");
			else if(Guess>Answer)
				System.out.println("Try lower");
			else
				System.out.println("You got it in "+NoAttempts+"attempts!");
		}while(Guess!=Answer);
	}
}
