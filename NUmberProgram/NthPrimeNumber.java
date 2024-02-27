//nth Prime Number In Java 
import java.util.Scanner;
public class NthPrimeNumber{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A Range : ");
		int num=sc.nextInt();
		
		for(int i=2;i<=num;i++){
			int flag=1;
			for(int j=2;j<=i/2;j++){
				if(i%j==0)
					flag=0;
			}
			if(flag==1)
				System.out.print(i+" ");
		}
	}
}