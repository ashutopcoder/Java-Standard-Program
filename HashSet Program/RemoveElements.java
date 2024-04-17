//Write a Java program to Removing elements of the hashset
import java.util.HashSet;
public class RemoveElements{
	public static void main(String args[]){
		HashSet<Integer> hs=new HashSet<>();
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(400);
		hs.add(500);
		hs.add(600);
		hs.add(700);
		System.out.println("Entered Elements : "+hs);
		hs.clear();
		System.out.println("\nAfter Removing Elements : "+hs);
		
	}
}