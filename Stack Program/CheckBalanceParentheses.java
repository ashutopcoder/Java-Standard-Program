//Write a Java program to Checking Balanced Parentheses using a Stack
import java.util.Stack;
class CheckBalanceParentheses{
	public static void main(String[] args){
		Stack<Character> st = new Stack<>();
		String str = "(23+3)*(23-7)";
		for(int i=0;i<str.length();i++)
			st.push(str.charAt(i));
		int countO=0;
		int countC=0;
		for(Character ch : st){
			if(ch=='(')
				countO++;
			if(ch==')')
				countC++;
			}
		if(countC==countO)
			System.out.println("Balanced Parentheses");
		else
			System.out.println("Not Balanced Parentheses");
	}
}