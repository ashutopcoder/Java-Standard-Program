/*Write a Java program to append the specified element to the end of a hash set
*/
import java.util.HashSet;
public class AppendElement{
	public static void main(String args[]){
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		System.out.println("Entered Elements : "+hs);
		hs.add(24);
		System.out.println("After Append Elements : "+hs);
	}
}