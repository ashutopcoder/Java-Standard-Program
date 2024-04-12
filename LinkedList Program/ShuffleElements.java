//Write a Java program to shuffle elements in a linked list.
import java.util.LinkedList;
import java.util.Collections;
public class ShuffleElements{
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
	list.add(90);
	list.add(100);
	System.out.println("Entered Elements : "+list);
	Collections.shuffle(list);
	System.out.println("After Shuffle Elements Are : "+list);
	
	
	}
}