//9. Write a program to rotate an Array to the right by one position. 

import java.util.Scanner;
class RotateRightByOnePosition{
	public static void main(String args[]){
		int[] arr={1,2,3,4,5,6,7,8,9};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How Many Times To Rotate : ");
		int num=sc.nextInt();
		for(int i=0;i<num;i++){
			int temp=arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--){
				arr[j]=arr[j-1];
			}
			arr[0]=temp;
		}
		for(int j=0;j<arr.length;j++){
			System.out.print(arr[j]+" ");
		}
	}
}