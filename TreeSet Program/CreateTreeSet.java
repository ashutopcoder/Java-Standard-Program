// Write a Java program to create a TreeSet collection
import java.util.TreeSet;
public class CreateTreeSet{
	public static void main(String args[]){
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		ts.add(60);
		System.out.println("TreeSet Elements : "+ts);
	}
}