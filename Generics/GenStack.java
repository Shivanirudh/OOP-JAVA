import java.util.Scanner;

class StackFullException extends Exception{
	public String toString(){
		return "Stack is Full";
	}
}

class StackEmptyException extends Exception{
	public String toString(){
		return "Stack is Empty";
	}
}

class StackImpl<T>{
	T[] data; 
	int top,limit;
	
	StackImpl(int limit,T[] arr){
		data=arr;
		top=-1;
		this.limit=limit;
	}
	
	void pushStack(T x) throws StackFullException{
		
		if(top==limit-1)
			throw new StackFullException();
		else{
			data[++top]=x;
			System.out.print("\n Push Attempt Successful \n");
		}
	}
	
	void popStack() throws StackEmptyException{
		if(top==-1)
			throw new StackEmptyException();
		else{
			System.out.println("\n"+data[top--]+" has been popped ");
			System.out.print("\n Pop Attempt Successful \n");
		}
	}
	
	void displayElements(){
		for(int i=0;i<=top;i++)
			System.out.print(data[i]+" ");
	}
}

public class GenStack{	
	public static void main(String args[]){
		int limit;
		Scanner in=new Scanner(System.in);
		System.out.print(" Enter the capacity of the stack ");
		limit=in.nextInt();
		
		int dataType;
		do{
			System.out.print("\n Choose data type\n 1-Integer\n 2-Double\n Your choice: ");dataType=in.nextInt();
		
			
		}while(dataType!=1 && dataType!=2);
		
		Integer iarr[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		Double darr[]={0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
		StackImpl<Integer> iS=new StackImpl<Integer>(limit,iarr);
		StackImpl<Double> dS=new StackImpl<Double>(limit,darr);
		int option;
		do{
			System.out.print("\n Wassup?\n 1-push\n 2-pop\n 3-display\n 0-exit\n");
			System.out.print(" Your choice: ");option=in.nextInt();
			
			if(option==1){
				if(dataType==1){
					int x;
					System.out.print("\n Enter element to push: ");x=in.nextInt();
					
					try{
						iS.pushStack(x);
					}
					catch(StackFullException sfe){
						System.out.print("\n"+sfe.toString()+". Cannot perform push operation \n");
					}
				}
				else if(dataType==2){
					double x;
					System.out.print("\n Enter element to push: ");x=in.nextDouble();
					try{
						dS.pushStack(x);
					}
					catch(StackFullException sfe){
						System.out.print("\n"+sfe.toString()+". Cannot perform push operation \n");
					}
				}
			}
			else if(option==2){
				try{
					if(dataType==1)
						iS.popStack();
					else
						dS.popStack();
				}
				catch(StackEmptyException see){
					System.out.print("\n"+see.toString()+". Cannot perform pop operation \n");
			 	}
			 }
			 else if(option==3){
			 	if(dataType==1)
			 		iS.displayElements();
			 	else
			 		dS.displayElements();
			 }
			 else if(option!=0)
			 	System.out.println("\nInvalid option ");
			 else;
		}while(option!=0);
	}
}

/*
Output:
 Enter the capacity of the stack 5

 Choose data type
 1-Integer
 2-Double
 Your choice: 1

 Wassup?
 1-push
 2-pop
 3-display
 0-exit
 Your choice: 1

 Enter element to push: 1

 Push Attempt Successful 

 Wassup?
 1-push
 2-pop
 3-display
 0-exit
 Your choice: 1

 Enter element to push: 2

 Push Attempt Successful 

 Wassup?
 1-push
 2-pop
 3-display
 0-exit
 Your choice: 1

 Enter element to push: 3

 Push Attempt Successful 

 Wassup?
 1-push
 2-pop
 3-display
 0-exit
 Your choice: 1

 Enter element to push: 4

 Push Attempt Successful 

 Wassup?
 1-push
 2-pop
 3-display
 0-exit
 Your choice: 1

 Enter element to push: 5

 Push Attempt Successful 

 Wassup?
 1-push
 2-pop
 3-display
 0-exit
 Your choice: 1

 Enter element to push: 6

Stack is Full. Cannot perform push operation 

 Wassup?
 1-push
 2-pop
 3-display
 0-exit
 Your choice: 3
1 2 3 4 5 
 Wassup?
 1-push
 2-pop
 3-display
 0-exit
 Your choice: 2

5 has been popped 

 Pop Attempt Successful 

 Wassup?
 1-push
 2-pop
 3-display
 0-exit
 Your choice: 2

4 has been popped 

 Pop Attempt Successful 

 Wassup?
 1-push
 2-pop
 3-display
 0-exit
 Your choice: 2

3 has been popped 

 Pop Attempt Successful 

 Wassup?
 1-push
 2-pop
 3-display
 0-exit
 Your choice: 2

2 has been popped 

 Pop Attempt Successful 

 Wassup?
 1-push
 2-pop
 3-display
 0-exit
 Your choice: 2

1 has been popped 

 Pop Attempt Successful 

 Wassup?
 1-push
 2-pop
 3-display
 0-exit
 Your choice: 2

Stack is Empty. Cannot perform pop operation 

 Wassup?
 1-push
 2-pop
 3-display
 0-exit
 Your choice: 3

 Wassup?
 1-push
 2-pop
 3-display
 0-exit
 Your choice: 0
*/

