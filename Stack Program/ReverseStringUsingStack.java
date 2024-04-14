//Write a Java program to Reversing a String using a Stack
import java.util.Stack;
public class ReverseStringUsingStack{
	public static void main(String args[]){
		Stack<String> st=new Stack<>();
		st.push("A");
		st.push("B");
		st.push("C");
		st.push("D");
		st.push("E");
		st.push("F");
		st.push("G");
		System.out.println(st);
		System.out.println("\nAfter Pop : ");
		for(int i=0;i<st.size();){
		System.out.println(st.pop());
		}
		
	}
}