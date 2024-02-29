//Square Root Without Using Sqrt Meathod
import java.util.Scanner;
public class SquareRoot{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int num=sc.nextInt();
		int flag=0;
		int i=0;
		for(i=2;i<=num/2;i++){
			if(num==i*i){
			flag=1;
			break;
			}
		}
		if(flag==1)
		System.out.print("Square Root Of Number Is : "+i );
	}
}