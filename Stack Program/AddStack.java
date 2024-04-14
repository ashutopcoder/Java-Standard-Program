//Java program to add a Stack collection into another Stack collection
import java.util.Stack;
public class AddStack{
	public static void main(String args[]){
		Stack<Integer> list=new Stack<>();
		list.push(10);
		list.push(20);
		list.push(30);
		list.push(40);
		list.push(50);
		list.push(60);
		System.out.println("\nFirst List : "+list);
		Stack<Integer> list2=new Stack<>();
		list2.push(100);
		list2.push(200);
		list2.push(300);
		list2.push(400);
		list2.push(500);
		list2.push(600);
		System.out.println("\nSecond List : "+list2);
		list.addAll(list2);
		System.out.println("\nAfter Adding Both Lists : "+list);
		
		
	}
}