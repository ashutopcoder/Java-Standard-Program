//To insert the specified element at the Last of a linked list.
import java.util.LinkedList;
public class AddElementAtLast{
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
		list.addLast(1000);
		System.out.println("After Adding Element At Last Position : "+list);
	}
}