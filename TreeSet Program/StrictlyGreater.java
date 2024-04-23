/*Java program to get the strictly greater element from TreeSet collection based on a given item
*/
import java.util.TreeSet;
public class StrictlyGreater{
	public static void main(String args[]){
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(10);
		ts.add(212);
		ts.add(123);
		ts.add(345);
		ts.add(543);
		ts.add(213);
		ts.add(678);
		ts.add(986);
		System.out.println("Entered Elements : "+ts);
		int num=ts.higher(25);
		System.out.println("Strictly Greater Element : "+num);
		
	}
}