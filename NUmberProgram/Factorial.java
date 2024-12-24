import java.util.Scanner;

class Factorial{
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number Which Number Factorial You Find : ");
		int num=sc.nextInt();;
		int fact=1;
		for(int i=num;i>0;i--){
			fact=fact*i;
		}
		System.out.println("Facorial Of A Number Is : "+fact);
	}
}
