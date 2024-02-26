package com.demo;

import java.util.Scanner;

public class Palindrome {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		int temp = num;
		int rem=0;
		int num1=0;
		while(num>0) {
		 rem = num%10;
		 num1 = num1*10+rem;
		 num = num/10;
		}
		if(temp!=num1) 
			System.out.println("Not Palindrome");
		else
			System.out.println("Palindrome");
		
	}

}
