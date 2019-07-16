/*4. Write a program to Find the Number of Non-Repeated Elements in an Array.*/

import java.util.Scanner;

public class Frequency{
	public static void main(String args[]){
		int Arr[]=new int[100];
		int numLimit;
		Scanner in=new Scanner(System.in);

		System.out.print("Enter the number of elements ");numLimit=in.nextInt();

		System.out.println("\nEnter the Array: ");
		for(int i=0;i<numLimit;i++)
			Arr[i]=in.nextInt();
		
		int Distinct[]=new int[100];
		int distinctCounter=0,flag=0;
		for(int i=0;i<numLimit;i++){
			flag=0;
			for(int j=i+1;j<numLimit&&flag==0;j++){
				if(Arr[i]==Arr[j])
					flag=1;
			}
			for(int j=0;j<i&&flag==0;j++){
				if(Arr[i]==Arr[j])
					flag=1;
			}
			if(flag==0)
				Distinct[distinctCounter++]=Arr[i];
		}
		
		System.out.println("\nThe number of Non-repetitive elements is "+distinctCounter);
		System.out.println("\nThey are: ");
		for(int i=0;i<distinctCounter;i++)
			System.out.print(Distinct[i]+" ");
		
	}
}	

/*Output:
Enter the number of elements 10
Enter the Array: 
5 5 5 5 5 6 6 6 6 7
The number of Non-repetitive elements is 1
They are: 
7
*/
