//Evil Number
//Number Whose Binary Number Has Even Number Of 1
// 9 : 1001 => 2 1s
import java.util.Scanner;
public class EvilNumbers{
	public static void main(String args[]){
		int count=0;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		for(int i=1;i<=num;num=num/2){
			if(num%2==1)
				count++;
		}
		if(count%2==0)
			System.out.print("Entered Number Is Evil Number");
		else
			System.out.print("Entered Number Is Not A Evil Number");
	
}
}