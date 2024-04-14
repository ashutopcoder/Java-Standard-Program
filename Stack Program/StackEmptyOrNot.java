//Java program to check whether a Stack collection is empty or not
import java.util.Stack;
public class StackEmptyOrNot{
	public static void main(String args[]){
		Stack<Integer> list=new Stack<>();

		boolean ans=list.isEmpty();
		if(ans)
			System.out.println("Stack Is Empty .");
		else
			System.out.println("Element Present In Stack.");
	}
}