import java.util.Scanner;

public class GenFunc{
	public static <T extends Number> T maxOf(T[] arr){
		T max=arr[0];
		
		for(int i=0;i<arr.length;i++)
			if(max.doubleValue()<arr[i].doubleValue())
				max=arr[i];
		
		return max;
	}
	
	public static void main(String args[]){
		int option,n;
		Scanner in=new Scanner(System.in);
		
		do{
			System.out.println("Choose data type 1-Integer 2-Double ");
			System.out.print(" Your choice: ");option=in.nextInt();
			
			if(option==1){

				System.out.print("Enter size: ");n=in.nextInt();
				Number arr[]=new Integer[n];				
				System.out.println("Enter the array ");
				for(int i=0;i<n;i++)
					arr[i]=in.nextInt();
				
				System.out.println("\n The maximum value is "+GenFunc.maxOf(arr));
			}
			else if(option==2){
				
				System.out.print("Enter size: ");n=in.nextInt();
				Number arr[]=new Double[n];
				System.out.println("Enter the array ");
				for(int i=0;i<n;i++)
					arr[i]=in.nextDouble();
				
				System.out.println("\n The maximum value is "+GenFunc.maxOf(arr));
			}
			
			else if(option !=0)
				System.out.println("Invalid option");
			else;
		}while(option!=0);
	}
}	
			
			
/*
Output:
Choose data type 1-Integer 2-Double 
 Your choice: 1
Enter size: 5
Enter the array 
1 2 3 4 5

 The maximum value is 5
Choose data type 1-Integer 2-Double 
 Your choice: 2
Enter size: 5
Enter the array 
5 7 8 9 6 1

 The maximum value is 9.0
Choose data type 1-Integer 2-Double 
 Your choice: Enter size: 0

*/				
