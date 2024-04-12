/*Write a Java program to retrieve, but not remove, the first 
element of a linked list.
*/
import java.util.LinkedList;
public class RetriveFirstElement{
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
		System.out.println("\nEntered List : "+list);
		int num=list.peekFirst();
		System.out.println("\nFirst Element Of List : "+num);
		System.out.println("\nNew List : "+list);
		
	}
}