// Xylem and Phloem Number
import java.util.Scanner;
public class XylemPhloem{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num=sc.nextInt();
		int temp=num;
		int ph=0,xy=0;
		for(int i=0;i<num;num=num/10){
			if((num==temp)||(num<10))
				xy=xy+num%10;
			else
				ph=ph+num%10;
		}
		if(xy==ph)
			System.out.print("Number Is Xylem.");
		else
			System.out.print("Number Is Ploem.");
	}
} 
