//Linked HashSet Implimentation
import java.util.LinkedHashSet;

public class LinkedHashSetExample{
	public static void main(String args[]){
		LinkedHashSet<String> items=new LinkedHashSet<>();
		items.add("Mohit");
		items.add("Monu");
		items.add("Ashu");
		items.add("Shiva");
		items.add("Mukesh");
		items.add("Rakesh");
		items.add("Prince");
		System.out.println("Items : "+items);
	}
}