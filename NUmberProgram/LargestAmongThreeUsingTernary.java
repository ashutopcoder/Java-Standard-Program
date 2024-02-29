//Largest Number B/W Three
import java.util.Scanner;
public class LargestAmongThreeUsingTernary{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int a=sc.nextInt();
		System.out.println("Enter B Number : ");
		int b=sc.nextInt();
		System.out.println("Enter C Number : ");
		int c=sc.nextInt();
		if((a>b)&&(a>c))
		System.out.print("A Is Largest.");
			if((b>a)&&(b>c))
				System.out.print("B Is Largest.");
			else
				System.out.print("C Is Largest.");
		
	}
}