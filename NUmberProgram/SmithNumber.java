//SmithNumber 
//Ex - 121-->(1+2+1=4)
//Factors of 121 : 11X11 (They Should be Prime)
//NUM 121 =>1+2+1 == 1+1+1+1 <= 11X11
import java.util.Scanner;
public class SmithNumber{
	public static boolean CheckPrime(int x){
		for(int i=2;i<=x/2;i++){
			if(x%i==0)
				return false;
		}
		return true;
	}
	public static int Add(int x){
		int rem=0;
		int add=0;
			for(int i=0;i<x;x=x/10){
				rem=x%10;
				add=add+rem;
			}
		return add;
		}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num =sc.nextInt();
		int fsum=0;
		int nsum= Add(num);
		int i=2;
		while(num>=i){
			if(num%i==0){
				fsum=fsum+Add(i);
				num=num/i;
				i=1;
			}
		i=i+1;
		}
		if(nsum==fsum)
			System.out.print("Smith Number");
		else
			System.out.print("Not A Smith Number");
	}
}