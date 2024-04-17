/*Write a Java program to Removes first Occurrence of the element specified in the argument list from the hashset
*/
import java.util.HashSet;
public class RemoveFirstOccurance{
	public static void main(String args[]){
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);
		hs.add(70);
		System.out.println("Entered Elements : "+hs);
		hs.remove(10);
		System.out.println("After Removing First Occurence Elements : "+hs);
		
	}
}