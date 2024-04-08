//Write a Java program to reverse elements in an array list.
import java.util.ArrayList;
public class ReverseArrayList{
	public static void main(String Args[]){
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		System.out.println("Before Reverse ArrayList : ");
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		System.out.println("After Reverse ArrayList : ");
			for(int i=al.size()-1;i>=0;i--){
			System.out.println(al.get(i));
		}
		
	}
}