package com.demo;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String [] args) {
		int flag=0;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num=sc.nextInt();
		for(int i=2;i<=num/2;i++) {
			if(num%i==0)
				flag=1;
		}
		if(flag==1) {
			System.out.println(num+" Is Not Prime");
		}
		else
			System.out.println(num+" Is Prime");
	}
	
}
