//Write a Java program to get the size of Stack collection
import java.util.Stack;
public class StackSize{
	public static void main(String args[]){
		Stack<Integer> list =new Stack<>();
		list.add(10);
		list.add(10);
		list.add(100);
		list.add(101);
		list.add(102);
		list.add(104);
		list.add(106);
		list.add(1078);
		list.add(108);
		list.add(1011);
		System.out.println("Elements : "+list);
		System.out.println("Stack Size : "+list.size());
	}
}