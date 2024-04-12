//To insert the specified element at the front of a linked list.
import java.util.LinkedList;
public class AddElementAtFirst{
	public static void main(String args[]){
		LinkedList<Integer> list=new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		System.out.println("Entered LinkedList : "+list);
		list.addFirst(1000);
		System.out.println("After Adding Element At First Position : "+list);
	}
}