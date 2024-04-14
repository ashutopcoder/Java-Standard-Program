/*Write a Java program to create a stack with hybrid items using Stack collection
*/
import java.util.Stack;
public class HybridItemsStack{
	public static void main(String args[]){
		Stack<Object> list =new Stack<>();
		list.add(10);
		list.add("Cat");
		list.add(14.6f);
		list.add(12.345);
		list.add('A');
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}