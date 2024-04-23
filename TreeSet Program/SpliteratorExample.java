/*Write a Java program to access elements from TreeSet Collection using spliterator() method
*/
import java.util.TreeSet;
import java.util.Spliterator;
public class SpliteratorExample{
	public static void main(String args[]){
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		ts.add(60);
		System.out.println("Entered Elements : "+ts);
		Spliterator<Integer> spl=ts.spliterator();
		spl.forEachRemaining(System.out::println);		
	}
}