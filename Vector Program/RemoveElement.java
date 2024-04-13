//Write a Java program to remove a specified item from Vector collection
import java.util.Vector;
public class RemoveElement{
	public static void main(String args[]){
		Vector<Integer> list=new Vector<>();
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
		Integer num = 40;
		list.remove(num);
		System.out.println("Updated Elements : "+list);
	}
}