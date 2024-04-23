//Java program to iterate TreeSet collection in ascending order
import java.util.TreeSet;
import java.util.Iterator;
public class IterateAscending{
	public static void main(String args[]){
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(10);
		ts.add(100);
		ts.add(210);
		ts.add(120);
		ts.add(110);
		ts.add(130);
		ts.add(2110);
		Iterator it =ts.iterator();
		System.out.println("Ascending Order Element : ");
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}