package com.demo;

import java.util.Scanner;

public class ReverseANumber {
	public static void main(String [] args) {
		int num = 2025;
		int temp = num;
		int count = 0;
		for(int i=0;i<num;num=num/10) {
			count++;
		}
		if(count%2==0) {
			int div = (int)Math.pow(10, count/2);
			int firstHalf = temp/div;
			int secondHalf = temp%div;
			int newNum = firstHalf+secondHalf;
			if(newNum*newNum==temp)
				System.out.println("It is Tech Number");
			else
				System.out.println("Not A Tech Number");
		}else {
			System.out.println("It is not a Tech Number");
		}
	}

}
