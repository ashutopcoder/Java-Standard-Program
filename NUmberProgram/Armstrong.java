package com.demo;

import java.util.Scanner;

public class Armstrong {
	public static void main(String [] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int num=sc.nextInt();
		int temp=num;
		int sum =0;
		int rem=0;
		while(num>0) {
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println(temp+" Is Armstrong.");
		}
		else {
			System.out.println(temp+" Is Not  Armstrong.");
		}
		
		
				
	}

}
