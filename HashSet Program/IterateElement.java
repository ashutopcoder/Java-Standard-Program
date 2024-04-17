//Java program to iterate through all elements in a hash list
import java.util.HashSet;
import java.util.Iterator;
public class IterateElement{
	public static void main(String args[]){
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);
		hs.add(70);
		System.out.println("Iterate ELements Through Iterator : ");
		Iterator it=hs.iterator();
		while(it.hasNext()){
			System.out.println("\nElement : "+it.next());
		}
	}
}