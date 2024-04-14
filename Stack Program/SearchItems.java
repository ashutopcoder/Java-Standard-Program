//Write a Java program to search an item in a Stack collection
import java.util.Stack;
import java.util.Scanner;
public class SearchItems{
	public static void main(String args[]){
		Stack<Integer> list=new Stack<>();
		list.push(10);
		list.push(20);
		list.push(30);
		list.push(40);
		list.push(50);
		list.push(60);
		System.out.println(list);
		System.out.println("Enter Element Which You Want To Search : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean ans=list.contains(num);
		if(ans)
			System.out.println("Element Found .");
		else
			System.out.println("Element Not Found .");
			
	}
}