/*Java program to Get and Remove the largest element from the TreeSet collection
*/
import java.util.TreeSet;
public class GetAndRemoveLargest{
	public static void main(String args[]){
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(10);
		ts.add(120);
		ts.add(102);
		ts.add(103);
		ts.add(130);
		ts.add(310);
		ts.add(510);
		System.out.println("\nEntered Elements : "+ts);
		int num=ts.pollLast();
		System.out.println("\nLarget Element Is : "+num);
		System.out.println("\nLargest Element Removed . ");
		System.out.println("\nRemaining Elements : "+ts);
		
	}
}