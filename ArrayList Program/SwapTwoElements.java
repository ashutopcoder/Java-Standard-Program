//Write a Java program that swaps two elements in an array list.
import java.util.ArrayList;
import java.util.Collections;
public class SwapTwoElements{
	public static void main(String args[]){
		ArrayList<String> al=new ArrayList<>();
		al.add("Pik");
		al.add("Red");
		al.add("Blue");
		al.add("Green");
		al.add("Yellow");
		al.add("Orange");
		al.add("Grey");
		System.out.println("Entered ArrayList : ");
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		Collections.swap(al,3,4);
		System.out.println("After Swapping : ");
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
	}
}