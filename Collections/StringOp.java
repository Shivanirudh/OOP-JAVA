import java.util.*;

public class StringOp{
	public static void main(String args[]){
		
		ArrayList<String> arr=new ArrayList<String>();
		
		arr.add("Hi");
		arr.add("Hello");
		System.out.println("Array is: "+arr);
		
		arr.add(1,"Little");
		System.out.println("Array is: "+arr);
		
		String element=new String();
		Scanner in=new Scanner(System.in);
		element=in.nextLine();
		
		System.out.println(element+" is found at "+arr.indexOf(element));
		
		char chr;
		chr=in.next().charAt(0);
		ListIterator<String> itr=arr.listIterator();
		while(itr.hasNext()){
			element=itr.next();
			char ch=element.charAt(0);
			if(ch==chr)
				System.out.println(itr.next());
				
		}
		
		Collections.sort(arr);
		System.out.println("Sorted Array is: "+arr);
		
		element=in.nextLine();
		ListIterator<String> itr1=arr.listIterator();
		while(itr1.hasNext()){
			String str=itr1.next();
			if(element.equals(str)){
				arr.remove(arr.indexOf(str));
			}
		}
		
		
		String s1=new String();
		String s2=new String();
		s1=in.nextLine();s2=in.nextLine();
		arr.set(arr.indexOf(s1),s2);
		
		LinkedHashSet<String> hash=new LinkedHashSet<>(arr);
		ArrayList<String> arr1=new ArrayList<>(hash);
		System.out.println("No duplicate array: "+arr1);
		
		int flag=0;
		String sub=new String();
		sub=in.nextLine();
		ListIterator<String> itr2=arr.listIterator();
		while(itr2.hasNext()){
			String str=itr2.next();
			if(str.contains(sub)){
				System.out.println(element+" ");
				flag=1;
			}
		}
		if(flag==0){
			System.out.println("Not found");
		}
			
	}
}
		
/*
Output:
Array is: [Hi, Hello]
Array is: [Hi, Little, Hello]
Hello
Hello is found at 2
L
Little
Sorted Array is: [Hello, Hi, Little]
Little
Hi
Hello 
No duplicate array: [Hello]
ll
Hello
 
*/		
