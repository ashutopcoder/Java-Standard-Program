//Write a Java program to empty an hash set
import java.util.HashSet;
public class EmptyHashSet{
	public static void main(String args[]){
	HashSet<Integer> hs=new HashSet<>();
	hs.add(1);
	hs.add(2);
	hs.add(3);
	hs.add(4);
	hs.add(5);
	System.out.println("Entered Elements : "+hs);
	hs.clear();
	System.out.println("After Empty  : "+hs);
	
	}
}