//Mystery Number
import java.util.Scanner;
public class MysteryNumber{
	public static int Reverse(int num){
		int rem=0;
		int rev=0;
		while(num>0){
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num=sc.nextInt();
		int temp=num;
		for(int i=0;i<num/2;i++){
			int rev = Reverse(i);
			if((i+rev)==temp)
				System.out.println(i+" "+rev+"="+num+"Is A Mytery Number");	
		}
	}
}