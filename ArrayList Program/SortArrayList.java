//Write a Java program to sort a given array list.
import java.util.ArrayList;
import java.util.Collections;
public class SortArrayList{
	public static void main(String args[]){
		ArrayList<Integer> al=new ArrayList<>();
		al.add(5);
		al.add(7);
		al.add(6);
		al.add(8);
		al.add(1);
		al.add(9);
		al.add(4);
		al.add(2);
		al.add(3);
		al.add(10);
		//Before Sorting :
		
		System.out.println("Entered ArrayList : ");
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		//After Sorting : 
		Collections.sort(al);
		System.out.println("Sorted ArrayList : ");
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}	
		
	}
}