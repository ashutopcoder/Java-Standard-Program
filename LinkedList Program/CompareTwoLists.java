//Write a Java program to compare two linked lists.
import java.util.LinkedList;
public class CompareTwoLists{
	public static void main(String args[]){
		LinkedList<Integer> list =new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		System.out.println("\nFirst Entered List : "+list);
		LinkedList<Integer> list1 =new LinkedList<>();
		list1.add(1);
		list1.add(2);
		list1.add(30);
		list1.add(4);
		list1.add(50);
		list1.add(60);
		list1.add(7);
		list1.add(10);
		System.out.println("\nSecond Entered List : "+list1);
		System.out.println("\nSize Of First List : "+list.size());
		System.out.println("\nSize Of Second List : "+list1.size());
		int count=0;
		for(int i=0;i<list.size();i++){
			for(int j=0;j<list1.size();j++){
				if(list.get(i)==list1.get(j))
					count++;
			}
		}
		System.out.println("\nElement Matched In Both List : "+count);
	}
}