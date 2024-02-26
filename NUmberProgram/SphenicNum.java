//SphenicNumber:
// 222 = 2*3*37 sphenic
// 16 = 2*2*2*2  not sphenic
import java.util.Scanner;
public class SphenicNum{
	public static boolean Prime(int x){
		for(int i=2;i<=x/2;i++)
			if(x%i==0)
				return false;
		return true;
	}
	public static void main(String args[])
	{
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter A Number : ");
	int num =sc.nextInt();
	int newNum = 1;
	int count=0;
	for(int i=2;i<=num/2;i++){
		if(num%i==0)
			if(SphenicNum.Prime(i)){
			newNum=newNum*i;
			count++;
			if(count==3)
				break;
			}
	}
	if(num==newNum)
		System.out.print("Spenic Number.");
	else
		System.out.print("Not Sphenic Number.");
	}
}