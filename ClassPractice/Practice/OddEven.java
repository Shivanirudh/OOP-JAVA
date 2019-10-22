import java.util.*;

public class OddEven{
	public static void main(String args[]){
		int num;
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("\nEnter a number ");num=in.nextInt();
		
		if(num%2==0)
			System.out.println("Even");
		else 
			System.out.println("Odd");
	}
}
