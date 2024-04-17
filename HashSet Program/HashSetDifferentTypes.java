//Java program to Create a HashSet with different types of items
import java.util.HashSet;
public class HashSetDifferentTypes{
	public static void main(String args[]){
		HashSet<Object> hs=new HashSet<>();
		hs.add(10);
		hs.add(1.2f);
		hs.add(23.345);
		hs.add('A');
		hs.add("Abhishek");
		System.out.println("\nElements : "+hs);
	}
}