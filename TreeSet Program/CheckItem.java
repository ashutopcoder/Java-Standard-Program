/*Write a Java program to check whether an item exists in a TreeSet collection or not
*/

import java.util.TreeSet;
import java.util.Scanner;
public class CheckItem{
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
		System.out.println("\nEnter A Element Which You Want To Search : ");
		int num =sc.nextInt();
		boolean ans=ts.contains(num);
		if(ans)
			System.out.println("ELement Is Present.");
		else
			System.out.println("ELement Is Not Present.");
	}
}