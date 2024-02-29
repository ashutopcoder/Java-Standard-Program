//AlternatePrime
import java.util.Scanner;
public class AlternatePrime{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A Range : ");
		int range =sc.nextInt();
		for(int i=2;i<=range;i++){
			int flag=1;
			for(int j=2;j<i/2;j++){
				if(i%j==0)
					flag=0;
			}
			if(flag==1)
			System.out.print(i+" ");
		}
	}
}