//Write a Java program to shuffle elements in an array list.
import java.util.ArrayList;
import java.util.Collections;
public class ShuffleElements{
	public static void main(String args[]){
		ArrayList<String> al=new ArrayList<>();
		al.add("Red");
		al.add("Green");
		al.add("Blue");
		al.add("White");
		al.add("Orange");
		al.add("Yellow");
		System.out.println("Entered ArrayList : ");
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		System.out.println("Shuffle ArrayList : ");
		Collections.shuffle(al);
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		
	}
}