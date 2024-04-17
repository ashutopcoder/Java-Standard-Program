//Write a Java program to convert a hash set to an array
import java.util.HashSet;
import java.util.Iterator;
public class HashSetToArray{
	public static void main(String args[]){
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);
		System.out.println("Entered Elements : "+hs);
		int[] arr=new int[hs.size()];
		Iterator it =hs.iterator();
		int i=0;
		while(it.hasNext()){
			arr[i]=(int)it.next();
			i++;
		}
		for(int j=0;j<arr.length;j++){
		System.out.println("Array Is Here :"+arr[j]);
		}
	}
}