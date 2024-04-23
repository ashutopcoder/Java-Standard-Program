//Traverse Elements by Iterate Meathod : 
import java.util.LinkedHashSet;
import java.util.Iterator;

public class TraverseUsingIterator{
	public static void main(String args[]){
		LinkedHashSet<Integer> item=new LinkedHashSet<>();
		item.add(1);
		item.add(2);
		item.add(3);
		item.add(4);
		item.add(5);
		item.add(6);
		//Iterate Using Iterator
		Iterator it=item.iterator();
		while(it.hasNext()){
			System.out.println("Element : "+it.next());
		}
	}
}