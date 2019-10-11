import java.util.*;

public class DLL{
	public static void main(String args[]){
		LinkedList<Integer> dll=new LinkedList<Integer>();
		
		Scanner in=new Scanner(System.in);
		
		int option;
		
		do{
			System.out.println(" Do what?");
			System.out.println(" 1.Insert on both sides");
			System.out.println(" 2.Delete on both sides");
			System.out.println(" 3.Insert at index");
			System.out.println(" 4.Delete element ");
			System.out.println(" 5.Search element");
			System.out.println(" 6.Display in forward and reverse order");
			System.out.println(" 7.Sort");
			System.out.println(" 8.Replace element with list");
			System.out.println(" 9.Remove duplicates" );
			option=in.nextInt();
			
			if(option==1){
				int x;
				System.out.print("Enter element to insert at front");
				x=in.nextInt();
				dll.addFirst(x);
				System.out.print("Enter element to insert at end");
				x=in.nextInt();
				dll.add(x);
			}
			else if(option==2){
				
				dll.removeFirst();
				dll.removeLast();
			}
			else if(option==3){
				int x,index;
				System.out.print("Enter element to insert");
				x=in.nextInt();
				System.out.print("Enter index to insert at");
				index=in.nextInt();
				dll.add(index,x);
			}
			else if(option==4){
				int x;
				System.out.print("Enter element to delete");
				x=in.nextInt();
				dll.remove(dll.indexOf(x));
			}
			else if(option==5){
				int x;
				System.out.print("Enter element to search for");
				x=in.nextInt();
				System.out.println("Found at index "+dll.indexOf(x));
			}
			else if(option==6){
				System.out.println("Forward order: "+dll);
				Collections.reverse(dll);
				System.out.println("Reverse order: "+dll);
				Collections.reverse(dll);
			}
			else if(option==7){
				Collections.sort(dll);
				System.out.println("Sorted list: "+dll);
			}
			else if(option==8){
				int x,y;
				System.out.print("Enter element to replace ");
				x=in.nextInt();
				System.out.print("Enter replacement ");
				y=in.nextInt();
				dll.set(dll.indexOf(x),y);
			}
			else if(option==9){
				LinkedList<Integer> noDup=new LinkedList<Integer>();
				
				for(int i=0;i<dll.size();i++){
					if(!noDup.contains(dll.get(i)))
						noDup.add(dll.get(i));
				}
				dll=noDup;
				System.out.println("Non Duplicate "+dll);
			}
			else if(option!=0)
				System.out.println("Invalid choice ");
			else;
		}while(option!=0);
	}
}

/*
Output:
 Do what?
 1.Insert on both sides
 2.Delete on both sides
 3.Insert at index
 4.Delete element 
 5.Search element
 6.Display in forward and reverse order
 7.Sort
 8.Replace element with list
 9.Remove duplicates
1
Enter element to insert at front5
Enter element to insert at end10
 Do what?
 1.Insert on both sides
 2.Delete on both sides
 3.Insert at index
 4.Delete element 
 5.Search element
 6.Display in forward and reverse order
 7.Sort
 8.Replace element with list
 9.Remove duplicates
1
Enter element to insert at front6
Enter element to insert at end11
 Do what?
 1.Insert on both sides
 2.Delete on both sides
 3.Insert at index
 4.Delete element 
 5.Search element
 6.Display in forward and reverse order
 7.Sort
 8.Replace element with list
 9.Remove duplicates
1
Enter element to insert at front3
Enter element to insert at end56
 Do what?
 1.Insert on both sides
 2.Delete on both sides
 3.Insert at index
 4.Delete element 
 5.Search element
 6.Display in forward and reverse order
 7.Sort
 8.Replace element with list
 9.Remove duplicates
1
Enter element to insert at front13 
Enter element to insert at end14
 Do what?
 1.Insert on both sides
 2.Delete on both sides
 3.Insert at index
 4.Delete element 
 5.Search element
 6.Display in forward and reverse order
 7.Sort
 8.Replace element with list
 9.Remove duplicates
6
Forward order: [13, 3, 6, 5, 10, 11, 56, 14]
Reverse order: [14, 56, 11, 10, 5, 6, 3, 13]
 Do what?
 1.Insert on both sides
 2.Delete on both sides
 3.Insert at index
 4.Delete element 
 5.Search element
 6.Display in forward and reverse order
 7.Sort
 8.Replace element with list
 9.Remove duplicates
2
 Do what?
 1.Insert on both sides
 2.Delete on both sides
 3.Insert at index
 4.Delete element 
 5.Search element
 6.Display in forward and reverse order
 7.Sort
 8.Replace element with list
 9.Remove duplicates
6
Forward order: [3, 6, 5, 10, 11, 56]
Reverse order: [56, 11, 10, 5, 6, 3]
 Do what?
 1.Insert on both sides
 2.Delete on both sides
 3.Insert at index
 4.Delete element 
 5.Search element
 6.Display in forward and reverse order
 7.Sort
 8.Replace element with list
 9.Remove duplicates
3
Enter element to insert15
Enter index to insert at3
 Do what?
 1.Insert on both sides
 2.Delete on both sides
 3.Insert at index
 4.Delete element 
 5.Search element
 6.Display in forward and reverse order
 7.Sort
 8.Replace element with list
 9.Remove duplicates
6
Forward order: [3, 6, 5, 15, 10, 11, 56]
Reverse order: [56, 11, 10, 15, 5, 6, 3]
 Do what?
 1.Insert on both sides
 2.Delete on both sides
 3.Insert at index
 4.Delete element 
 5.Search element
 6.Display in forward and reverse order
 7.Sort
 8.Replace element with list
 9.Remove duplicates
4
Enter element to delete10
 Do what?
 1.Insert on both sides
 2.Delete on both sides
 3.Insert at index
 4.Delete element 
 5.Search element
 6.Display in forward and reverse order
 7.Sort
 8.Replace element with list
 9.Remove duplicates
6
Forward order: [3, 6, 5, 15, 11, 56]
Reverse order: [56, 11, 15, 5, 6, 3]
 Do what?
 1.Insert on both sides
 2.Delete on both sides
 3.Insert at index
 4.Delete element 
 5.Search element
 6.Display in forward and reverse order
 7.Sort
 8.Replace element with list
 9.Remove duplicates
5
Enter element to search for15
Found at index 3
 Do what?
 1.Insert on both sides
 2.Delete on both sides
 3.Insert at index
 4.Delete element 
 5.Search element
 6.Display in forward and reverse order
 7.Sort
 8.Replace element with list
 9.Remove duplicates
7
Sorted list: [3, 5, 6, 11, 15, 56]
 Do what?
 1.Insert on both sides
 2.Delete on both sides
 3.Insert at index
 4.Delete element 
 5.Search element
 6.Display in forward and reverse order
 7.Sort
 8.Replace element with list
 9.Remove duplicates
8
Enter element to replace 5
Enter replacement 10
 Do what?
 1.Insert on both sides
 2.Delete on both sides
 3.Insert at index
 4.Delete element 
 5.Search element
 6.Display in forward and reverse order
 7.Sort
 8.Replace element with list
 9.Remove duplicates
6
Forward order: [3, 10, 6, 11, 15, 56]
Reverse order: [56, 15, 11, 6, 10, 3]
 Do what?
 1.Insert on both sides
 2.Delete on both sides
 3.Insert at index
 4.Delete element 
 5.Search element
 6.Display in forward and reverse order
 7.Sort
 8.Replace element with list
 9.Remove duplicates
8
Enter element to replace 10
Enter replacement 11
 Do what?
 1.Insert on both sides
 2.Delete on both sides
 3.Insert at index
 4.Delete element 
 5.Search element
 6.Display in forward and reverse order
 7.Sort
 8.Replace element with list
 9.Remove duplicates
9
Non Duplicate [3, 11, 6, 15, 56]
 Do what?
 1.Insert on both sides
 2.Delete on both sides
 3.Insert at index
 4.Delete element 
 5.Search element
 6.Display in forward and reverse order
 7.Sort
 8.Replace element with list
 9.Remove duplicates
0
*/
