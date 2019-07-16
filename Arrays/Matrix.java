/*3. Write a program to perform a menu driven program to do matrix addition, subtraction and multiplication.*/

import java.util.Scanner;
public class Matrix{
	public static void main(String args[]){
		int r1,r2,c1,c2;
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter number of rows in matrix 1 ");r1=in.nextInt();
		System.out.print("Enter number of columns in matrix 1 ");c1=in.nextInt();
		int mat1[][]=new int[r1][c1];
		
		System.out.println("Enter matrix 1:");
		for(int i=0;i<r1;i++)
			for(int j=0;j<c1;j++)
				mat1[i][j]=in.nextInt();

		System.out.print("Enter number of rows in matrix 2 ");r2=in.nextInt();
		System.out.print("Enter number of columns in matrix 2 ");c2=in.nextInt();
		int mat2[][]=new int[r2][c2];

		System.out.println("Enter matrix 2:");
		for(int i=0;i<r2;i++)
			for(int j=0;j<c2;j++)
				mat2[i][j]=in.nextInt();

		int option;

		do{
			System.out.print("Enter the operation to be performed 1-Addition 2-Subtraction 3-Multiplication 0-Exit "); option=in.nextInt();
			
			if(option==1){
				if(r1==r2 && c1==c2){
					int r3=r1,c3=c1;
					int mat3[][]=new int[r3][c3];

					for(int i=0;i<r3;i++)
						for(int j=0;j<c3;j++)
							mat3[i][j]=mat1[i][j]+mat2[i][j];

					System.out.println("\nMatrix 1:");
					for(int i=0;i<r1;i++){
						for(int j=0;j<c1;j++)
							System.out.print(mat1[i][j]+" ");

						System.out.println(" ");
					}
					
					System.out.println("\nMatrix 2:");
					for(int i=0;i<r2;i++){
						for(int j=0;j<c2;j++)
							System.out.print(mat2[i][j]+" ");

						System.out.println(" ");
					}

					System.out.println("\nMatrix 3:");
					for(int i=0;i<r3;i++){
						for(int j=0;j<c3;j++)
							System.out.print(mat3[i][j]+" ");

						System.out.println(" ");
					}
				}
				else{
					System.out.println("\nUnequal number of rows and columns. Cannot perform addition");
				}
			}
			else if(option==2){
				if(r1==r2 && c1==c2){
					int r3=r1,c3=c1;
					int mat3[][]=new int[r3][c3];

					for(int i=0;i<r3;i++)
						for(int j=0;j<c3;j++)
							mat3[i][j]=mat1[i][j]-mat2[i][j];

					System.out.println("\nMatrix 1:");
					for(int i=0;i<r1;i++){
						for(int j=0;j<c1;j++)
							System.out.print(mat1[i][j]+" ");

						System.out.println(" ");
					}
					
					System.out.println("\nMatrix 2:");
					for(int i=0;i<r2;i++){
						for(int j=0;j<c2;j++)
							System.out.print(mat2[i][j]+" ");

						System.out.println(" ");
					}

					System.out.println("\nMatrix 3:");
					for(int i=0;i<r3;i++){
						for(int j=0;j<c3;j++)
							System.out.print(mat3[i][j]+" ");

						System.out.println(" ");
					}
				}
				else{
					System.out.println("\nUnequal number of rows and columns. Cannot perform subtraction");
				}
			}
			else if(option==3){
				if(c1==r2){
					int r3=r1,c3=c2;
					int mat3[][]=new int[r3][c3];

					for(int i=0;i<r3;i++)
						for(int j=0;j<c3;j++)
							mat3[i][j]=0;

					for(int i=0;i<r1;i++)
						for(int j=0;j<c2;j++)
							for(int k=0;k<r2;k++)
								mat3[i][j]+=mat1[i][k]*mat2[k][j];
				
					System.out.println("\nMatrix 1:");
					for(int i=0;i<r1;i++){
						for(int j=0;j<c1;j++)
							System.out.print(mat1[i][j]+" ");

						System.out.println(" ");
					}
					
					System.out.println("\nMatrix 2:");
					for(int i=0;i<r2;i++){
						for(int j=0;j<c2;j++)
							System.out.print(mat2[i][j]+" ");

						System.out.println(" ");
					}

					System.out.println("\nMatrix 3:");
					for(int i=0;i<r3;i++){
						for(int j=0;j<c3;j++)
							System.out.print(mat3[i][j]+" ");

						System.out.println(" ");
					}
				}
				else{
					System.out.println("\nc1 is not equal to r2. Cannot perform multiplication");
				}
			}
			else if(option!=0)
				System.out.println("\nInvalid option ");
		}while(option!=0);
	}
}
/*
Output:
Enter number of rows in matrix 1 3
Enter number of columns in matrix 1 3
Enter matrix 1:
1 2 3 4 5 6 7 8 9
Enter number of rows in matrix 2 3
Enter number of columns in matrix 2 3
Enter matrix 2:
9 8 7 6 5 4 3 2 1
Enter the operation to be performed 1-Addition 2-Subtraction 3-Multiplication 0-Exit 1
Matrix 1:
1 2 3  
4 5 6  
7 8 9  
Matrix 2:
9 8 7  
6 5 4  
3 2 1  
Matrix 3:
10 10 10  
10 10 10  
10 10 10  
Enter the operation to be performed 1-Addition 2-Subtraction 3-Multiplication 0-Exit 2
Matrix 1:
1 2 3  
4 5 6  
7 8 9  
Matrix 2:
9 8 7  
6 5 4  
3 2 1  
Matrix 3:
-8 -6 -4  
-2 0 2  
4 6 8  
Enter the operation to be performed 1-Addition 2-Subtraction 3-Multiplication 0-Exit 3
Matrix 1:
1 2 3  
4 5 6  
7 8 9  
Matrix 2:
9 8 7  
6 5 4  
3 2 1  
Matrix 3:
30 24 18  
84 69 54  
138 114 90  
Enter the operation to be performed 1-Addition 2-Subtraction 3-Multiplication 0-Exit 0
___________________________________________________________________________________________
Enter number of rows in matrix 1 3
Enter number of columns in matrix 1 5
Enter matrix 1:
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
Enter number of rows in matrix 2 2
Enter number of columns in matrix 2 4
Enter matrix 2:
1 2 
3 4 5 6 7 8
Enter the operation to be performed 1-Addition 2-Subtraction 3-Multiplication 0-Exit 1
Unequal number of rows and columns. Cannot perform addition
Enter the operation to be performed 1-Addition 2-Subtraction 3-Multiplication 0-Exit 2
Unequal number of rows and columns. Cannot perform subtraction
Enter the operation to be performed 1-Addition 2-Subtraction 3-Multiplication 0-Exit 3
c1 is not equal to r2. Cannot perform multiplication
Enter the operation to be performed 1-Addition 2-Subtraction 3-Multiplication 0-Exit 0
*/
