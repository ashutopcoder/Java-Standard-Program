package com.demo;

import java.util.Scanner;

public class AutomprphicNumber {
	public static void main(String [] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int num=sc.nextInt();
		int sq=num*num;
		int flag=1;
		System.out.println("Entered Number Is : "+num);
		System.out.println("Squre Of Number Is : "+sq);
		
		while(num>0) {
		if(num%10!=sq%10){
			flag=0;
		}
		num=num/10;
		sq=sq/10;
	}
		if(flag==1){
		System.out.println("It Is A Automorphic Number");	
		}
		else
			System.out.println("It Is Not A Automrphic Number");
	}

}
