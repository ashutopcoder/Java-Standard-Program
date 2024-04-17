//Write a Java program to Traverse over the elements of the hashset
import java.util.HashSet;
import java.util.Iterator;
public class TraverseElement{
	public static void main(String args[]){
		HashSet<Character> hs=new HashSet<>();
		hs.add('A');
		hs.add('B');
		hs.add('C');
		hs.add('D');
		hs.add('E');
		hs.add('F');
		Iterator it=hs.iterator();
		while(it.hasNext()){
			System.out.println("Element : "+it.next());
		}
		
	}
}