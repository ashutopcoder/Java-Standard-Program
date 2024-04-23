/*Write a Java program to get the flooring item of specified value from TreeSet collection
*/
import java.util.TreeSet;
import java.util.Scanner;

public class FlooringValue{
	public static void main(String args[]){
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		ts.add(60);
		ts.add(45);
		ts.add(32);
		System.out.println("Entered Elements : "+ts);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Which Element Find Flooring Value : ");
		int num=sc.nextInt();
		System.out.println("Flooring valie Of "+num+" is : "+ts.floor(num));
		
	}
}