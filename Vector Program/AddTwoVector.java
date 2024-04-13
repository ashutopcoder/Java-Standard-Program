/*Write a Java program to add elements of a Vector to other Vector collection
*/
import java.util.Vector;
public class AddTwoVector{
	public static void main(String args[]){
		Vector<Integer> list =new Vector<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("First List : "+list);
		Vector<Integer> list1 =new Vector<>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(400);
		list1.add(500);
		System.out.println("\nSecond List : "+list1);
		list.addAll(list1);
		System.out.println("\nAfter Adding Elements Of Other Vector Collection : "+list);
		
	}
}