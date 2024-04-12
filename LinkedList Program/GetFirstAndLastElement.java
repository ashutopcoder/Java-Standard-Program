/*To get the first and last occurrence of the 
specified elements in a linked list.
*/
import java.util.LinkedList;
public class GetFirstAndLastElement{
	public static void main(String args[]){
	LinkedList<Integer> list=new LinkedList<>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	list.add(60);
	list.add(70);
	list.add(80);
	list.add(90);
	list.add(100);
	System.out.println("Entered LinkedList : "+list);
	System.out.println("First Element Of LinkedList : "+list.getFirst());
	System.out.println("Last Element Of LinkedList : "+list.getLast());
	
	
	}
}