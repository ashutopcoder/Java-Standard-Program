//Java program to get the largest item from the TreeSet collection
import java.util.TreeSet;
public class FindLargest{
	public static void main(String args[]){
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(10);
		ts.add(100);
		ts.add(120);
		ts.add(90);
		ts.add(80);
		ts.add(170);
		ts.add(210);
		ts.add(310);
		ts.add(910);
		ts.add(510);
		System.out.println("Entered Elements : "+ts);
		System.out.println("\nLargest Element : "+ts.last());
		System.out.println("\nAfter Finding Largest Elements : "+ts);
		
	}
}