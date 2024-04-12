/*Write a Java program to retrieve, but not remove, the
 last element of a linked list.
*/
import java.util.LinkedList;
public class RetriveLastElement{
	public static void main(String args[]){
		LinkedList<Integer> list=new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println("\nEntered List : "+list);
		int num=list.peekLast();
		System.out.println("\nLast Element : "+num);
		System.out.println("\nAfter Retrive Last Elment : "+list);
		
	}
}