//Check Number Is Positive Or Negative Or Zero
import java.util.Scanner;
public class NegativePositiveZero{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num=sc.nextInt();
		if(num>0)
			System.out.print("Number Is Positive.");
			else if(num<0)
				System.out.print("Number Is Negative.");
			else
				System.out.print("Number Is Zero");
	}
}