/*Java program to get the strictly lower element from TreeSet collection
*/
import java.util.TreeSet;
public class StrictlyLower{
	public static void main(String args[]){
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(60);
		ts.add(50);
		ts.add(5);
		System.out.println("ELements : "+ts);
		int num = ts.lower(41);
		System.out.println("Stictly Lower Element Is : "+num);
	}
}