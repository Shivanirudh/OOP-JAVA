/*1. Write a program to sort an array.*/

import java.util.Scanner;

public class ArraySort{
    public static void main(String args[]){
        int Arr[]=new int[100];
        int numLimit;
        Scanner obj=new Scanner(System.in);
        
        System.out.print("Enter the number of elements ");
        numLimit=obj.nextInt();
        
        System.out.println("Enter the array: ");
        for(int i=0;i<numLimit;i++)
            Arr[i]=obj.nextInt();
        
        System.out.println("Before sorting: ");
        for(int i=0;i<numLimit;i++)
        	System.out.print(Arr[i]+" ");
            
        int min=0;    
        for(int i=0;i<numLimit;i++){
	    min=i;
            for(int j=i;j<numLimit;j++)
                if(Arr[min]>Arr[j])
                    min=j;
            int tmp=Arr[min];
            Arr[min]=Arr[i];
            Arr[i]=tmp;
        }
        
        System.out.println("\nAfter sorting: ");
        for(int i=0;i<numLimit;i++)
        	System.out.print(Arr[i]+" ");
        
    }
}        

/*Output:
Enter the number of elements 10
Enter the array: 
0 9 8 7 6 5 4 3 2 1
Before sorting: 
0 9 8 7 6 5 4 3 2 1 
After sorting: 
0 1 2 3 4 5 6 7 8 9 
*/

