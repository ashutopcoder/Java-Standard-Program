//Write a Java program for trimming the capacity of an array list.
import java.util.ArrayList;
public class TrimmingArrayList{
	public static void main(String args[]){
		ArrayList<Integer> al =new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.trimToSize();
		System.out.println("After Trimming : ");
		for(int i=0;i<al.size();i++){
		System.out.print(al.get(i)+" ");
		}
	}
}