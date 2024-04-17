/*Write a Java program to Check whether a HashSet contains a specified item or not
*/
import java.util.HashSet;
import java.util.Scanner;

public class ContainsElement{
	public static void main(String args[]){
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Element Which You Want To Find : ");
		int num=sc.nextInt();
		boolean ans=hs.contains(num);
		if(ans)
			System.out.println("Element Is Present");
		else
			System.out.println("Element Is Not Present");
	}
}