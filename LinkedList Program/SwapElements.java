//Write a Java program that swaps two elements in a linked list.
import java.util.LinkedList;
import java.util.Scanner;
public class SwapElements{
	public static void main(String args[]){
		LinkedList<Integer> list =new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		System.out.println("Before Swap LinkedList : "+list);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Index : ");
		int fi=sc.nextInt()-1;
		System.out.println("Enter Second Index : ");
		int si=sc.nextInt()-1;
		int num = list.get(fi);
		list.set(fi,list.get(si));
		list.set(si,num);
		System.out.println("After Swap LinkedList : "+list);
		
		
		
	}
}