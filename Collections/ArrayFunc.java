import java.util.*;

public class ArrayFunc{
	public static void main(String args[]){
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		
		int a1,a2;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter array1");
		for(int i=0;i<5;i++){
			a1=in.nextInt();
			arr1.add(a1);
		}
		System.out.println("Enter array2");
		for(int i=0;i<5;i++){
			a2=in.nextInt();
			arr2.add(a2);
		}
		
		arr1.addAll(arr2);
		System.out.println("Merged: "+arr1);
		
		Set<Integer> s=new HashSet<Integer>();
		s.addAll(arr1);s.addAll(arr2);
		System.out.println("Union: "+s);
		
		List<Integer> l=new ArrayList<Integer>();
		for(Integer i: arr1){
			if(arr1.contains(i))
				l.add(i);
		}
		System.out.println("Intersection: "+l);
		
		if(arr1.equals(arr2))
			System.out.println("Equal");
		else
			System.out.println("Unequal");
		
	}
}

/*
Output:
Enter array1
10 24 54 61 32
Enter array2
21 10 61 50 90
Merged: [10, 24, 54, 61, 32, 21, 10, 61, 50, 90]
Union: [32, 50, 21, 54, 24, 10, 90, 61]
Intersection: [10, 24, 54, 61, 32, 21, 10, 61, 50, 90]
Unequal
*/
