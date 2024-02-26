//EmripNumber
import java.util.Scanner;
public class EmripNum{
	public static boolean Prime(int x){
	for(int i=2;i<=x/2;i++){
		if(x%i==0)
		return false;
	}
	return true;
	}
	public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	System.out.println("Eter A Nmber : ");
	int num1=sc.nextInt();
	int num=num1;
	int num2=0;
	int rem=0;
	 while(num>0){
	 rem=num%10;
	 num=num/10;
	 num2=num2*10+rem;
	 }
	 
	if(Prime(num1))
		System.out.println("Emip Number");
	else
		System.out.println("Not Emrip Number");
	}
}