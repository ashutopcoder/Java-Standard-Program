//GCD of Two Number
import java.util.Scanner;
public class GCD{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num1=sc.nextInt();
		System.out.print("Enter B Number : ");
		int num2=sc.nextInt();
		int smallest = Math.min(num1,num2);
		int hcf=1;
		for(int i=1;i<=smallest;i++){
			if((num1%i==0)&&(num2%i==0))
				hcf=i;
		}
		System.out.print("HCF Of NUmbers Is : "+hcf);
	}
}