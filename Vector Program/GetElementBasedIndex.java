//Program to get elements from Vector collection based on an index
import java.util.Vector;
public class GetElementBasedIndex{
	public static void main(String args[]){
		Vector<Integer> list =new Vector<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		for(int i=0;i<list.size();i++){
			System.out.println("Element : "+list.get(i));
		}
	}
}