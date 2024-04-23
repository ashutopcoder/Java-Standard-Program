/*Write a Java program to add non-common elements of one TreeSet into another TreeSet collection
*/
import java.util.TreeSet;

public class AddTwoTreeSet{
	public static void main(String args[]){
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		System.out.println("\nFirst TreeSet Elements : "+ts);
		TreeSet<Integer> ts2=new TreeSet<>();
		ts2.add(110);
		ts2.add(20);
		ts2.add(130);
		ts2.add(40);
		ts2.add(140);
		System.out.println("\nSecond TreeSet Elements : "+ts2);
		ts.addAll(ts2);
		System.out.println("\nAfter Adding : "+ts);
		
	}
}