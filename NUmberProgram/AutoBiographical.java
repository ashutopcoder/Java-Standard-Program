package com.demo;

import java.util.Scanner;

public class AutoBiographical {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int num=sc.nextInt();
		int temp=num;
		int count=0;
		for(int i=0;i<num;num=num/10) {
			count++;
		}
		int i=count-1;
		num=temp;
		int[] arr= new int[count];
		while(num>0) {
			int rem=num%10;
			arr[i]=rem;
			num=num/10;
			i--;
		}
		int flag=1;
		for(i=0;i<count;i++) {
			int cout=0;
				for(int j=0;j<count;j++) {
					if(arr[j]==i) {
						cout++;
					}
				}
				if(cout!=arr[i]) {
					flag=0;
				}
			}
		if(flag==1)
			System.out.println("Autobiographical Number");
		else
			System.out.println("Not autobiographical");
	}

}
