public class PrintPattern{
	static void printCheckerPattern(int n){
        
        for(int i=0;i<n;i++){
            if(i%2==0)
                for(int j=0;j<5;j++)
                    System.out.print("* ");
            else
                for(int j=0;j<5;j++)
                    System.out.print(" *");
            System.out.println();
        }
  	}
  	
  	static void printSquarePattern(int n){
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||i==n-1)
                    System.out.print("* ");
                else if(j==0||j==n-1)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
  	public static void main(String args[]){
  		int n=Integer.parseInt(args[0]);
  		printCheckerPattern(n);
  		System.out.println();
  		System.out.println();
  		printSquarePattern(n);
  		System.out.println();
  		System.out.println();
  		
  		
  		
  	}
}
