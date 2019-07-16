import java.util.Scanner;
public class CharToString{
	public static void main(String args[]){
		char Arr[]=new char[100];
		Scanner in=new Scanner(System.in);
		
		int limit;
		System.out.print("Enter number of characters ");limit=in.nextInt();
		System.out.println("Enter the array ");
		for(int i=0;i<limit;i++)
			Arr[i]=in.next().charAt(0);
			
		String s=new String(Arr);
		System.out.println("The string is :"+s);
	}
}
