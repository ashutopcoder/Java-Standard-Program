//Buzz Numbers
import java.util.Scanner;
public class BuzzNumbers{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number :");
		int num = sc.nextInt();
		if((num%7==0)||(num%10==7)){
			System.out.print("Entered Number Is Buzz Number");
		}
		else
			System.out.print("Entered Number Is Not A Buzz Number");
			
		
	}
}