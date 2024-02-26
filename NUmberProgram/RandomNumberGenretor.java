package com.demo;

import java.util.Random;

public class RandomNumberGenretor {
	public static void main(String [] args) {
		Random ran=new Random();
		int num = ran.nextInt(1000);
		System.out.println("Random Number : "+num);
		
		
	}
}
