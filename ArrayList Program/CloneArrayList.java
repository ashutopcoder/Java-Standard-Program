//Write a Java program to clone an array list to another array list.
import java.util.ArrayList;
public class CloneArrayList{
	public static void main(String args[]){
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		System.out.println("Entered Array : ");
		System.out.println(al);
		System.out.println("After Clonning : ");
		ArrayList list=(ArrayList)al.clone();
		for(int i=0;i<al.size();i++){
		System.out.println(list.get(i));
		}
		
	}
}