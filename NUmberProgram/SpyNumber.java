package com.demo;

import java.util.Scanner;

public class SpyNumber {
		
		public static boolean Spy(int x) {
			int sum=0;
			int product=1;
			while(x>0){
			int rem=x%10;
			sum=sum+rem;
			product=product*rem;
			x=x/10;
			}
			if(sum==product) {
				return true;
			}
			return false;
		}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		boolean result = SpyNumber.Spy(num);
		if(result) {
			System.out.println("Entered Number Is SpyNumber...!");
		
		}
		else
			System.out.println("Entered Number Is Not A SpyNumber....!");
	}
}
