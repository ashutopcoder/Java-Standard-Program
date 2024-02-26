package com.demo;

import java.util.Scanner;

public class ASCIIValue {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Character : ");
		char ch = sc.next().charAt(0);
		int num =ch;
		System.out.println("ASCII Value is : "+num);
			
			
		
	}

}
