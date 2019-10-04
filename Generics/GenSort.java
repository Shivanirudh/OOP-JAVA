import java.util.Scanner;

public class GenSort{
	public static <T extends Number> void sort(T[] arr){
		
		
		for(int i=0;i<arr.length;i++){
			int min=i;
			for(int j=i+1;j<arr.length;j++)
				if(arr[min].doubleValue()>arr[j].doubleValue())
					min=j;
			T tmp=arr[i];
			arr[i]=arr[min];
			arr[min]=tmp;
		}
		
		System.out.print("\nSorted array: ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String args[]){
		int option,n;
		Scanner in=new Scanner(System.in);
		
		do{
			System.out.println("\nChoose data type 1-Integer 2-Double ");
			System.out.print(" Your choice: ");option=in.nextInt();
			
			if(option==1){
				System.out.print("Enter size: ");n=in.nextInt();
				Number arr[]=new Integer[n];				
				System.out.println("Enter the array ");
				for(int i=0;i<n;i++)
					arr[i]=in.nextInt();
					
				System.out.print("\nUnsorted array: ");
				for(int i=0;i<n;i++)
					System.out.print(arr[i]+" ");
				
				GenSort.sort(arr);
				
				
			}
			else if(option==2){
				
				System.out.print("Enter size: ");n=in.nextInt();
				Number arr[]=new Double[n];
				System.out.println("Enter the array ");
				for(int i=0;i<n;i++)
					arr[i]=in.nextDouble();
				
				System.out.print("\nUnsorted array: ");
				for(int i=0;i<n;i++)
					System.out.print(arr[i]+" ");
				
				GenSort.sort(arr);
				
				
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
6 8 4 9 2

Unsorted array: 6 8 4 9 2 
Sorted array: 2 4 6 8 9 
Choose data type 1-Integer 2-Double 
 Your choice: 2
Enter size: 5
Enter the array 
6 8 4 9 2

Unsorted array: 6.0 8.0 4.0 9.0 2.0 
Sorted array: 2.0 4.0 6.0 8.0 9.0 
Choose data type 1-Integer 2-Double 
 Your choice: 0
*/

