//Strontio Number
//In This Number Multply by Two and the Tens Digit And Hundrd Digit Are Same.Then The Number Is Strointio Number
//Example of Strontio Number : 7777, 8888, 9999, 1001 .
import java.util.Scanner;
public class StrontioNumber{
	public static void main(String args[]){
		System.out.print("Enter A Four Digit Number : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num1;
		int temp=0;
		if(num>=1000){
			num1=(num*2%1000)/10;
			if(num1%10==num1/10)
				System.out.print("Enter Nmber Is Strontio");
			else
				System.out.print("Enter Nmber Is Not Strontio");
			}
		else
			System.out.print("Wrong Enter");
		
	}
}