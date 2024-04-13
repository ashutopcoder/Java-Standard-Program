//Write a Java program to create a clone of a Vector collection
import java.util.Vector;
public class CloneElements{
	public static void main(String args[]){
		Vector<Integer> list =new Vector<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		System.out.println("Before Clonning : "+list);
		Vector list2=(Vector)list.clone();
		System.out.println("After Clonning : "+list2);
	}
}