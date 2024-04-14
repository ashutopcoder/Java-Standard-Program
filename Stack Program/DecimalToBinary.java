//Write a Java program to Decimal to Binary Conversion
import java.util.Stack;
import java.util.Scanner;
public class DecimalToBinary{
	public static void main(String args[]){
		Stack<Integer> st=new Stack<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Decimal Number : ");
		int num = sc.nextInt();
		for(int i=0;i<num;num=num/2)
			st.push(num%2);
		String bin="";
		while(!st.isEmpty())
			bin=bin+st.pop();
		System.out.print("Binary Number : "+bin);
	}
}