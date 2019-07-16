/*2. Write a program to perform linear and binary search on an array for the required element.*/

import java.util.Scanner; 

public class Searching{

	public static void ArraySort(int Arr[],int numLimit){
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
	}

	public static void main(String args[]){
		int Arr[]=new int[100];
		int numLimit,key;

		Scanner in=new Scanner(System.in);

		System.out.print("Enter the number of elements ");numLimit=in.nextInt();
		
		System.out.println("Enter the array: ");
        	for(int i=0;i<numLimit;i++)
        	    Arr[i]=in.nextInt();

		System.out.print("Enter the key ");key=in.nextInt();

		int choice;
	
		System.out.print("Enter searching method 1-linear 2-binary ");
		choice=in.nextInt();

		if(choice==1){        //Linear
			
			for(int i=0;i<numLimit;i++)
				if(Arr[i]==key){
					System.out.println(key+" found at index "+i);
					break;
				}
		}
		else if(choice==2){   //Binary
			
			ArraySort(Arr,numLimit);

			int fArr=0;int bArr=numLimit-1;
			int len=(fArr+bArr)/2;
			
			while(fArr<=bArr){
				if(key>Arr[len]){
					fArr=len+1;
					len=(fArr+bArr)/2;
				}
				else if(key<Arr[len]){
					bArr=len-1;
					len=(fArr+bArr)/2;
				}
				else{
					System.out.println(key+" found ");break;
				}
			}

		}
		else
			System.out.println("Invalid choice ");
	}
}

/*
Output:
Enter the number of elements 10
Enter the array: 
1 2 8 9 7 6 4 3 5 0
Enter the key 5
Enter searching method 1-linear 2-binary 1
5 found at index 8
Enter the number of elements 10
Enter the array: 
1 2 9 7 6 4 3 5 0
5
Enter the key 5
Enter searching method 1-linear 2-binary 2
5 found 
*/
