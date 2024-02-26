package com.demo;

import java.util.Scanner;

public class SunnyNumber {
	public static void main(String args[]) {
		System.out.println("Enter A Number : ");
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		num=num+1;
		double a=Math.sqrt(num);
		if(a%1==0) {
			System.out.println("It Is A Sunny Number");
		}
		else {
			System.out.println("It Is Not A Sunny Number");
		}
	}

}
