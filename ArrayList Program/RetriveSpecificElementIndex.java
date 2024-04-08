//Retrieve an element (at a specified index)
import java.util.ArrayList;
public class RetriveSpecificElementIndex{
	public static void main(String args[]){
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		System.out.print("Entered ArrayList : ");
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		System.out.println("Specific Element Through Indexing : "+al.get(2));
	}
}
