//Java program to Create the clone of the TreeSet collection
import java.util.TreeSet;
public class CloneTreeSet{
	public static void main(String args[]){
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(3);
		ts.add(56);
		ts.add(2);
		ts.add(87);
		ts.add(12);
		ts.add(43);
		System.out.println("\nElements : "+ts);
		TreeSet ts2=new TreeSet();
		ts2=(TreeSet)ts.clone();
		System.out.println("\nAfter Clone Elements : "+ts2);
		
	}
}