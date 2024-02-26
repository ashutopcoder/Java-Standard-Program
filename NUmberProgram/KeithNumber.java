package com.demo;

import java.util.Scanner;

public class KeithNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int num =sc.nextInt();
		int temp =num;
		int count=0;
		for(int i=0;i<num;num=num/10) {
			count++;
		} num=temp;
		int i=count-1;
		int[] arr = new int[count];
		while(num>0) {
			int rem=num%10;
			arr[i]=rem;
			num=num/10;
			i--;
		}
		num=temp;
		int sum = 0;
		int flag=0;
		while(sum<num) {
			sum=0;
			for(i=0;i<count;i++) {
				sum=sum+arr[i];
			}
			if(sum==num)
				flag=1;
			for(i=0;i<count-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[i]=sum;
		}
		if(flag==1)
			System.out.println("Keith");
		else
			System.out.println("Not Keith");
	}

}
