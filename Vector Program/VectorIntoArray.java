//Java program to copy elements of Vector collection into an array
import java.util.Vector;
import java.util.ArrayList;
public class VectorIntoArray{
	public static void main(String args[]){
		Vector<Integer> list =new Vector<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		list.add(50);
		list.add(60);
		System.out.println("Vector Items : "+list);
		ArrayList<Integer> arraylist=new ArrayList<>();
		for(int i=0;i<list.size();i++){
			arraylist.add(list.get(i));
		}
		for(int i=0;i<arraylist.size();i++){
		System.out.println("\nAfter Conversion : "+arraylist.get(i));
		}
	}
}