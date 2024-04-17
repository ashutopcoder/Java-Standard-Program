// To Create a set of Complex numbers using HashSet collections
import java.util.HashSet;
import java.util.Iterator;
public class ComplexNumber{
	public static void main(String args[]){
		HashSet<Integer> hs=new HashSet<>();
		hs.add(43);
		hs.add(45);
		hs.add(65);
		hs.add(26);
		hs.add(54);
		hs.add(27);
		hs.add(38);
		hs.add(59);
		Iterator it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next()+" + i"+it.next());
		}
	}
}