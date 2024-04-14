//Write a Java program to Reverse Linked List using Stack
import java.util.Stack;
import java.util.LinkedList;

public class ReverseLinkedListUsingStack{
	public static void main(String args[]){
		Stack<Integer> st=new Stack<>();
		LinkedList<Integer> list=new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println("\nEntered Linked List : "+list);
		for(int i=0;i<list.size();i++){
			st.push(list.get(i));
		}
		System.out.println("\nAfter Coping Elements In Stack : "+st);
		System.out.println("After Reversing Elements : ");
		while(st.size()>0){
			System.out.println(st.pop());
		}
	}
}