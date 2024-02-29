//Print Sum Of NaturalNumbers 
import java.util.Scanner;
public class SumNaturalNumbers{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A Range : ");
		int range=sc.nextInt();
		int sum=0;
		for(int i=0;i<=range;i++){
			sum=sum+i;
		}
		System.out.print("Sum Of Natural Number Is : "+sum);
	}
}