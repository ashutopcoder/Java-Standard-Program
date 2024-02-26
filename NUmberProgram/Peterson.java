package com.demo;

import java.util.Scanner;

public class Peterson {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int num = sc.nextInt();
		int temp=num;
		int rem;
		int fact=1;
		int sum=0;
		
		for(int i=num;i>0;i=i/10){
		rem=i%10;
		for(int j=rem;j>=1;j--) {
			fact = fact*j;
		}
		sum=sum+fact;
		fact=1;
		}
		
		if(temp==sum) {
			System.out.println("Number Is PeterSon.");
		}
		else
		{
			System.out.println("Number Is Not A Peterson.");
		}
		
		
	}
}
