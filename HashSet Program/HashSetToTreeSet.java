//Write a Java program to convert a hash set to a tree set
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
public class HashSetToTreeSet{
	public static void main(String args[]){
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);
		System.out.println("\nEntered Elements ; "+hs);
		TreeSet<Integer> ts=new TreeSet<>(hs);
		System.out.println("\nTreeSet Elements : "+ts);
	}
}