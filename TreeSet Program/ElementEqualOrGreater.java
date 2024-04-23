/* Write a Java program to get the elements greater than and equal to the specified item from TreeSet Collection
*/

import java.util.TreeSet;
import java.util.Scanner;

public class ElementEqualOrGreater{
	public static void main(String args[]){
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		ts.add(60);
		ts.add(70);
		System.out.println("\nElements : "+ts);
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Number Which You Find Ceiling Value : ");
		System.out.println();
		int num=sc.nextInt();
		System.out.println("\nCeiling Value Of "+num+" is :"+ts.ceiling(num));
	}
}