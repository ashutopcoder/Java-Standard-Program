//Write a Java program to increase an array list size.
import java.util.ArrayList;
public class ToIncreaseArrayListSize{
	public static void main(String args[]){
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.ensureCapacity(200);
		System.out.println("ArrayList : "+al);
		
	}
}