//Write a Java program to iterate through all elements in a linked list.
import java.util.LinkedList;
import java.util.Iterator;
public class IterateAllElementsByIterate{
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
		Iterator it = ll.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}