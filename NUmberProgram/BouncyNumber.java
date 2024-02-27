//BouncyNumber 
//It Is A NUmber In Which Not In Same Order Like Increasing number or decreasing 
//num=1234,4321(Wrong);1342is correct way
import java.util.Scanner;
public class BouncyNumber{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter A Number : ");
	int num=sc.nextInt();
	String str =Integer.toString(num);
	int len=str.length();
	int arr[]=new int[len];
		for(int i=len-1;i>=0;i--){
			arr[i]=num%10;
			num=num/10;
		}
		int flag=0;
		if(len>1){
			if(arr[0]>arr[1]){
				for(int i=0;i<len-1;i++){
						if(!(arr[i]>arr[i+1]))
						flag=1;
				}
			}
			else
					if(arr[0]<arr[1]){
				for(int i=0;i<len-1;i++){
						if(!(arr[i]<arr[i+1]))
						flag=1;
				}
			}
			if(flag==1)
			System.out.print("Bouncy Number");
		else
			System.out.print("Not A Bouncy Number");
		}
		else
			System.out.print("Number Is Single Digit");
	}
}