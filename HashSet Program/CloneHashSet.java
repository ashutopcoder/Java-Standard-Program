//Write a Java program to clone a hash set to another hash set
import java.util.HashSet;
import java.util.Iterator;
public class CloneHashSet{
	public static void main(String args[]){
		HashSet<Integer> hs=new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		System.out.println("First HashSet : "+hs);
		HashSet hs2=(HashSet)hs.clone();
		System.out.println("After Clonning : ");
		Iterator it=hs2.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
