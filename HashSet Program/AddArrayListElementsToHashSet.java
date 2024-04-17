//Write a Java program to Adding ArrayList elements to HashSet
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class AddArrayListElementsToHashSet{
	public static void main(String args[]){
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		System.out.println("ArrayList Elements : "+list);
		HashSet<Integer> hs=new HashSet<>(list);
		System.out.println("\nHashSet Items : ");
		Iterator it =hs.iterator();
		while(it.hasNext()){
			System.out.println("Element : "+it.next());
		}
	}
}