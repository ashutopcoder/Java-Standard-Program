//Write a Java program to Check Palindrome or Not
import java.util.Stack;
public class CheckPalindrome{
	public static void main(String args[]){
		Stack<Character> st=new Stack<>();
		String str = "NAMAN";
		String temp= "";
		for(int i=0;i<str.length();i++)
			st.push(str.charAt(i));
		for(Character ch : st)
			temp=temp+ch;
		if(temp==str)
			System.out.println("Palindrome");
		else
			System.out.println("Palindrome");
	}
}