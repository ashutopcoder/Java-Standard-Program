//Write a Java program to get the number of elements in a hash set
import java.util.HashSet;
public class CountElement{
	public static void main(String args[]){
		HashSet<Character> hs=new HashSet<>();
		hs.add('A');
		hs.add('B');
		hs.add('C');
		hs.add('D');
		hs.add('E');
		System.out.println(hs);
		System.out.println("\nNumber Of Elements : "+hs.size());
	}
}