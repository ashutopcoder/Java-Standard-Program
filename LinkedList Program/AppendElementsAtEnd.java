//To append the specified element to the end of a linked list.
import java.util.LinkedList;
public class AppendElementsAtEnd{
	public static void main(String args[]){
		LinkedList<Integer> ll=new LinkedList<>();
		LinkedList<Integer> ll1=new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		System.out.println("List One : "+ll+" ");
		ll1.add(43);
		ll1.add(65);
		ll1.add(42);
		ll1.add(46);
		ll1.add(24);
		System.out.println("List Two : "+ll1+" ");
		ll.addAll(ll1);
		System.out.println("After Append : "+ll+" ");
		
		
	}
}