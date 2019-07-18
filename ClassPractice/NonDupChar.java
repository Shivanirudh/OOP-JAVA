import java.util.Scanner;

public class NonDupChar{
	public static void main(String args[]){
		String s;
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		s=in.nextLine();
		
		char Distinct[]=new char[100];
		
		int distinctCounter=0;
		
		for(int j=0;j<s.length();j++){
			int flag=0;
			for(int i=j+1;i<s.length();i++){
				if(s.charAt(j)==s.charAt(i))
					flag=1;
			}
			for(int i=0;i<j;i++)
				if(s.charAt(j)==s.charAt(i))
					flag=1;
			
			if(flag==0){
				Distinct[distinctCounter++]=s.charAt(j);
			}
		}
		
		for(int i=0;i<distinctCounter;i++)
			System.out.print(Distinct[i]+" ");
	}
}
