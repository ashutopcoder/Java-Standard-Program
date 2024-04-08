//Replace the second element of an ArrayList with the specified element.
import java.util.ArrayList;
public class ReplaceSecondElement{
	public static void main(String args[]){
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		System.out.println("Entered ArrayList : "+al);
		al.set(1,100);
		System.out.println("After Replacing Element ArrayList : "+al);
	}
}