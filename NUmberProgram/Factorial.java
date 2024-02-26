package com.demo;

import java.util.Scanner;

public class Factorial {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num=sc.nextInt();
		int a=1;
		for(int i=num;i>=1;i--) {
			a=a*i;
		}
		System.out.println("Factorial Of "+num+" is "+a);
		
	}

}
