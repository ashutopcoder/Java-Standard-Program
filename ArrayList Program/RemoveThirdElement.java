//Remove the third element from an array list.
import java.util.ArrayList;
public class RemoveThirdElement{
	public static void main(String args[]){
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		System.out.println("Entered ArrayList : ");
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		al.remove(2);
		System.out.println("After Removing Third Element : ");
			for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
	}
}