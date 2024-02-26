//ISBN Number
//In This Number Has 10 Digits
import java.util.Scanner;
public class ISBNNumber{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter A Number : ");
		String num=sc.next();
		if(num.length()==10)
			System.out.print("Number is ISBN");
		else
			System.out.print("Number Is Not ISBN");
}
}