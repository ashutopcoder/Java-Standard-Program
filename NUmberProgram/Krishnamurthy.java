//Krishnamurthy Number
// 145 = 1!+4!+5!.
import java.util.Scanner;
public class Krishnamurthy{
	public static void main(String args[]){
		System.out.print("Enter A Number : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int rem=0;
		int fact=1;
		int sum=0;
		for(int i=1;i<=num;num=num/10){
			rem=num%10;
			fact=1;
			for(int j=rem;j>=1;j--){
				fact=fact*j;
			}
			sum=sum+fact;
		}
		if(temp==sum)
			System.out.print("Number Is Krishnamurthy");
		else
			System.out.print("Number Is Not Krishnamurthy");
	}
}