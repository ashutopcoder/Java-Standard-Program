// Java Program to divide a string in 'N' equal parts.
import java.util.Scanner;
public class StringDivideNEqualParts{
	public static void main(String args[]){
		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num=sc.nextInt();
		int len=str.length()/num;
		int count=0;
		for(int i=0;i<str.length();i++){
				System.out.print(str.charAt(i));
				count++;
			if(count%len==0)
			System.out.println();
		}
		
	}
}
