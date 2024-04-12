/*
Write a Java program to check if a particular element 
exists in a linked list.
*/
import java.util.LinkedList;
import java.util.Scanner;
public class CheckElement{
	public static void main(String args[]){
		LinkedList<Integer> list=new LinkedList<>();
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
		System.out.println("Entered List : "+list);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Value Which You Want To Search : ");
		int num=sc.nextInt();
		if(list.contains(num)){
			System.out.println(num+" Is Present In List.");
		}
		else
		{
			System.out.println(num+" Is Not Present In List.");
			
		}
	}
}