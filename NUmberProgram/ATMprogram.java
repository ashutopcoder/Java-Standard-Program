package com.demo;

import java.util.Scanner;

public class ATMprogram{
	static  int  amount = 10_000;
	public static void deposit() {
		System.out.println("Enter Amount To Deposit : ");
		Scanner sc = new Scanner(System.in);
		int dep = sc.nextInt();
		amount = amount+dep; 
		System.out.println("Amount Deposit SuccessFully");
		
		
	}
	public static void withdrawl() {
		System.out.println("Enter Amount To Deposit : ");
		Scanner sc = new Scanner(System.in);
		int wit = sc.nextInt();
		amount = amount-wit;
		System.out.println("Withdrawl Successfully");
		
		
	}
	public static void checkbalance() {
		System.out.println("Your Balance Is : "+amount);
	}
	
	public static void main(String [] args) {
		while(true) {
			System.out.println("**************************");
		System.out.println("Press1 For Deposit");
		System.out.println("Press 2 For Withdrawl");
		System.out.println("Press 3 For CheckBalance");
		System.out.println("press 4 For Exit");
		Scanner sc =new Scanner(System.in);
		int in=sc.nextInt();
		switch(in){
		case 1:deposit();
		break;
		case 2:withdrawl();
		break;
		case 3:checkbalance();
		break;
		case 4:
			System.out.println("ThankYou");
			System.exit(0);
		break;
		}
		}
	}
}