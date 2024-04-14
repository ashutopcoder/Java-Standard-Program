//Java program to traverse a Stack collection using the foreach loop
import java.util.Stack;
public class TraverseStackUsingForeachLoop{
	public static void main(String args[]){
	Stack<Integer> list=new Stack<>();
	list.push(10);
	list.push(20);
	list.push(30);
	list.push(40);
	list.push(50);
	list.push(60);
	System.out.println("\nTraversing USing ForEach Loop : ");
	
		for(int value:list){
		System.out.println(value);
		}
	}
}