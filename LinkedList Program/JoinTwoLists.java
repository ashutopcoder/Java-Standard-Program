//Write a Java program to join two linked lists.
import java.util.LinkedList;
public class JoinTwoLists{
	public static void main(String args[]){
		LinkedList<Integer> list =new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("First List : "+list);
		LinkedList<Integer> list1 =new LinkedList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		System.out.println("Second List : "+list1);
		list.addAll(list1);
		System.out.println("After Join Lists : "+list);
		
		
		
	}
}