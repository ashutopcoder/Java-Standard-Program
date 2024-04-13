// To create a vector to store different types of objects
import java.util.Vector;
public class StoreDifferentTypesObject{
	public static void main(String args[]){
		Vector<Object> vc = new Vector<>();
		vc.add("Rahul");
		vc.add(12);
		vc.add('M');
		vc.add(21.6);
		vc.add(true);
		System.out.println(vc);
	}
}