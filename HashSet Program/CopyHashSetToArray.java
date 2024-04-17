//Java program to Copy all elements from HashSet to an array
import java.util.HashSet;
import java.util.Iterator;
public class CopyHashSetToArray{
	public static void main(String args[]){
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);
		hs.add(70);
		System.out.println("Entered Elements In HashSet : "+hs);
		int[] arr=new int[hs.size()];
		int i=0;
		Iterator it=hs.iterator();
		while(it.hasNext()){
			arr[i]=(int)it.next();
			i++;
		}
		for(int j=0;j<arr.length;j++){
		System.out.println("Array Elements : "+arr[j]);
		}
	}
}