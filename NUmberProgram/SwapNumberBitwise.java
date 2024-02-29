//Swap Two Numbers Using Bitwise Operator
import java.util.Scanner;
public class SwapNumberBitwise{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A Nuber");
		int a =sc.nextInt(); // 5
		System.out.print("Enter B Nuber");
		int b=sc.nextInt(); // 7
		a=a^b;   // 010 = 101 ^ 111
		b=a^b;  //  101 = 010 ^ 111
		a=a^b; //   111 = 010 ^ 101		
		System.out.println(a);
		System.out.println(b);
	}
}