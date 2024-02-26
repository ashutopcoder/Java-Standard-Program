//Duck Number
import java.util.Scanner;
public class DuckNumbers{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num =sc.nextInt();
		int flag=0;
		for(int i=0;i<num;num=num/10){
			if(num%10==0){
				flag=1;
			}
		}
		if(flag==1)
			System.out.print("Number is Duck Number");
		else
			System.out.print("Not A Duck Number");
			
	}
}