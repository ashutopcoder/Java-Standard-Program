//Write a Java program to remove all elements from a linked list.
import java.util.LinkedList; 
public class RemoveAllElements{
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
		System.out.println("Entered Elements : "+list);
		list.clear();
		System.out.println("Entered Elements : "+list);
		
		
	}
}