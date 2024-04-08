//Write a Java program to test whether an array list is empty or not.
import java.util.ArrayList;
public class CheckArrayListEmptyOrNot{
	public static void main(String args[]){
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		boolean ans=al.isEmpty();
		if(ans==true){
			System.out.println("Elements Not Present .");
		}
		else{
		System.out.println("Elements Are Present .");
		}
		System.out.println("\nFor Second ArrayList : ");
		ArrayList<Integer> al2=new ArrayList<>();
		boolean ans2=al.isEmpty();
		if(ans2==true){
			System.out.print("\nElements Not Present .");
		}
		else{
		System.out.print("\nElements Are Present .");
		}
		
	}
}