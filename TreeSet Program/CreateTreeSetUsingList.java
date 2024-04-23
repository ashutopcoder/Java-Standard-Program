//Java program to create a TreeSet collection using List collection
import java.util.ArrayList;
import java.util.TreeSet;

public class CreateTreeSetUsingList{
	public static void main(String args[]){
		ArrayList<String> list=new ArrayList<>();
		list.add("Mohan");
		list.add("Abhishek");
		list.add("Mukesh");
		list.add("Ashu");
		list.add("Shiva");
		System.out.println("\nList Items : "+list);
		TreeSet<String> ts=new TreeSet<>(list);
		System.out.println("\nTreeSet Items : "+ts);
	}
}