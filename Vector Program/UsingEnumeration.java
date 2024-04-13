//To get the enumeration of the values present in the Vector
import java.util.Vector;
import java.util.Enumeration;
public class UsingEnumeration{
	public static void main(String args[]){
		Vector<Integer> list =new Vector<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
	System.out.println("Elements : "+list);
	Enumeration en=list.elements();
	System.out.println("Elements Print Using Enumeration : ");
		while(en.hasMoreElements()){
		System.out.println("Element : "+en.nextElement());
		}
	}
}