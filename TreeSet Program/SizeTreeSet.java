// Write a Java program to get the size of a TreeSet collection
import java.util.TreeSet;
public class SizeTreeSet{
	public static void main(String args[]){
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Aman");
		ts.add("Ashu");
		ts.add("Asish");
		ts.add("Zubair");
		ts.add("Mukesh");
		ts.add("Shiva");
		System.out.println("Elements : "+ts);
		System.out.println("\nSize Of TreeSet Is : "+ts.size());
	}
}