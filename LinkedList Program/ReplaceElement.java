//Write a Java program to replace an element in a linked list.
import java.util.LinkedList;
public class ReplaceElement{
	public static void main(String args[]){
		LinkedList<Integer> list =new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		System.out.println("Entered List : "+list);
		list.set(3,1000);
		System.out.println("After Replacing Element : "+list);
	}
}