//Java program to add an ArrayList into Stack collection
import java.util.Stack;
public class AddArrayListIntoStack{
	public static void main(String args[]){
		Stack<Integer> st=new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println("Stack ELement : "+st);
		int[] arr={2,3,4,5,6};
		for(int i=0;i<arr.length;i++){
			st.push(arr[i]);
		}
		System.out.println("After Adding Array Elements : "+st);
	}
}