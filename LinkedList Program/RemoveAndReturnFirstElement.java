//Program to remove and return the first element of a linked list.
import java.util.LinkedList;
public class RemoveAndReturnFirstElement{
	public static void main(String args[]){
		LinkedList<Integer> list=new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		System.out.println("\nEntered List : "+list);
		int remove=list.removeFirst();
		System.out.println("\nRemoved Element : "+remove);
		System.out.println("\nEntered List : "+list);
		
	}
}
