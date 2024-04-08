//Write a Java program to empty an array list.
import java.util.ArrayList;
public class EmptyArrayList{
	public static void main(String args[]){
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(60);
		al.add(2);
		al.add(4);
		System.out.println("Entered Array : ");
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		System.out.println("After Remove All Elements : ");
		al.clear();
		System.out.println(al);
		System.out.println("No Elements Present .");
	}
}