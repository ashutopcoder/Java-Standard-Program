//Write a Java program to remove all elements of Vector collection
import java.util.Vector;
public class RemoveAllElements{
	public static void main(String args[]){
		Vector<Integer> list=new Vector<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(40);
		list.add(60);
		list.add(20);
		list.add(10);
		System.out.println("Entered Elements : "+list);
		list.clear();
		System.out.println("After Removing All Elements : "+list);
		
	}
}