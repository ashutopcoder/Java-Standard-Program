//Check given Number Is A PerfectSquare :-->>
import java.util.Scanner;
public class CheckPerfectSquare{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num =sc.nextInt();
		int flag=0;
		for(int i=0;i<=num/2;i++){
			if(num==i*i){
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.print("It Is A Perfect Square.");
	
		else
			System.out.print("It Is Not A Perfect Square.");
	}
}