//Write a Java program to convert a Stack collection into an Object array
import java.util.Stack;
public class Stack_ObjectArray{
	public static void main(String args[]){
		Stack<Integer> st=new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		System.out.println("Stack Elements : "+st);
		Object[] arr=st.toArray();
		System.out.println("\nArray Elements : ");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}
}