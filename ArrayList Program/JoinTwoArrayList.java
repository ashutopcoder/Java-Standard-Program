//Write a Java program to join two array lists.
import java.util.ArrayList;
public class JoinTwoArrayList{
	public static void main(String args[]){
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		ArrayList<Integer> al2=new ArrayList<>();
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(40);
		al2.add(50);
		System.out.println("Entered ArrayList : ");
		System.out.println("First Array : ");
		System.out.println(al);
		System.out.println("Second Array : ");
		System.out.println(al2);
		System.out.println("After Join ArrayList : ");
		al.addAll(al2);
		System.out.print(al);
		
	}
}