//Write a Java program to iterate a linked list in reverse order.
import java.util.LinkedList;
public class IterateInReverseOrder{
	public static void main(String args[]){
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(7);
		ll.add(8);
		ll.add(9);
		ll.add(10);
		System.out.println("Entered LinkedList : ");
		for(int i=0;i<ll.size();i++){
			System.out.println(ll.get(i));
		}
		System.out.println("After Reverse LinkedList : ");
		for(int i=ll.size()-1;i>=0;i--){
			System.out.println(ll.get(i));
		}
		
	}
}