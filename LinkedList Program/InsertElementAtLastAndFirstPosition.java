// Insert elements into the linked list at the first and last positions.
import java.util.LinkedList;
public class InsertElementAtLastAndFirstPosition{
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
		System.out.println("\nAfter Adding First Element : "+list);
		list.addLast(2000);
		System.out.println("\nAfter Adding Last Element : "+list);
		
	}
}