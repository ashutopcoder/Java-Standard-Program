//Java program to iterate through all elements in an array list.
import java.util.ArrayList;
import java.util.Iterator;
public class IterateElements{
	public static void main(String args[]){
		ArrayList<String> al=new ArrayList<>();
		al.add("Aman");
		al.add("Ashu");
		al.add("Rahul");
		al.add("Sonu");
		al.add("Mohan");
		al.add("Monu");
		al.add("Akshay");
		al.add("Mukesh");
		Iterator it=al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}
}