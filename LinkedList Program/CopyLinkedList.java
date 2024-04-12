//Write a Java program to copy a linked list to another linked list.
import java.util.LinkedList;
public class CopyLinkedList{
	public static void main(String args[]){
		LinkedList<Integer> list=new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		System.out.println("First LinkedList : "+list);
		
		LinkedList list1=(LinkedList)list.clone();
		System.out.println("Second LinkedList After Copying : "+list1);
		
		
	}
}