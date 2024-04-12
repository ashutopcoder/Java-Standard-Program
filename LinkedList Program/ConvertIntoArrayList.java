//Write a Java program to convert a linked list to an array list.
import java.util.ArrayList;
import java.util.LinkedList;
public class ConvertIntoArrayList{
	public static void main(String args[]){
		LinkedList<Integer> list=new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<list.size();i++)
			al.add(list.get(i));
		System.out.println("After Conversion : "+al);
	}
}