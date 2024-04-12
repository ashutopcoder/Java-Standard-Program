//Write a Java program to check if a linked list is empty or not.
import java.util.LinkedList;
public class ListEmptyOrNot{
	public static void main(String args[]){
		LinkedList<Integer> list =new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		boolean ans=list.isEmpty();
		if(ans==true)
			System.out.println("Yes Empty");
		else
			System.out.println("List Is Not Empty.");
	}
}