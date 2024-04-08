//Insert an element into the array list at the first position.
import java.util.ArrayList;
public class InsertElementAtFirstPos{
	public static void main(String args[]){
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		System.out.println("Entered ArrayList : ");
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		al.add(0,5);
		System.out.println("New ArrayList : ");
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		
	}
}
