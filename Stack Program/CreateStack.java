//Write a Java program to create a stack using Stack collection
import java.util.Stack;
public class CreateStack{
	public static void main(String args[]){
		Stack<Integer> list=new Stack<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		for(int i=0;i<list.size();i++){
		System.out.println(list.get(i));
		}
	}
}