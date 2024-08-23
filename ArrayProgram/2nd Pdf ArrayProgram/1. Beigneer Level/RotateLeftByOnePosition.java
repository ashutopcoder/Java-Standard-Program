//8. Write a program to rotate an Array to the left by one position. 

import java.util.Scanner;
class RotateLeftByOnePosition{
	public static void main(String args[]){
		int[] arr={1,2,3,4,5,6,7,8,9};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How Many Times To Rotate : ");
		int num=sc.nextInt();
		for(int i=0;i<num;i++){
			int temp=arr[0];
			for(int j=0;j<arr.length-1;j++){
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=temp;
		}
		for(int j=0;j<arr.length;j++){
			System.out.print(arr[j]+" ");
		}
	}
}