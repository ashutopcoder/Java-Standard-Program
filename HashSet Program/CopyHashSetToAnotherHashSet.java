//Write a Java program to Copy Set content to another HashSet
import java.util.HashSet;
public class CopyHashSetToAnotherHashSet{
	public static void main(String args[]){
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		System.out.println("First HashSet Elements : "+hs);
		HashSet<Integer> hs2=new HashSet<>();
		hs2.add(100);
		hs2.add(210);
		hs2.add(330);
		hs2.add(470);
		System.out.println();
		System.out.println("Second HashSet Elements : "+hs2);
		System.out.println("\nAfter Adding Elements Of Both HashSets : ");
		hs.addAll(hs2);
		System.out.println("Element : "+hs);
		
	}
}