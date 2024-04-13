// To insert an item into Vector collection at the specified index
import java.util.Vector;
public class AddElementSpecificIndex{
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
		System.out.println("Before Adding New Elements At Specific Index : "+list);
		list.add(3,1000);
		System.out.println("After Adding New Elements At Specific Index : "+list);
		
	}
}