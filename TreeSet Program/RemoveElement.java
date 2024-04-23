//Program To Remove a specified item from the TreeSet collection
import java.util.TreeSet;
import java.util.Scanner;
public class RemoveElement{
	public static void main(String args[]){
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(110);
		ts.add(100);
		ts.add(120);
		ts.add(130);
		ts.add(180);
		ts.add(200);
		ts.add(170);
		System.out.println("Elements : "+ts);
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter A Element Which You Want To Remove : ");
		int num =sc.nextInt();
		ts.remove(num);
		System.out.println("\nAfter Remove Element : "+ts);
		
	}
}