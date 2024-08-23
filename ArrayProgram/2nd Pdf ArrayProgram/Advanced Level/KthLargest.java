//37. Write a program to find the kth maximum element in an array. 
import java.util.Scanner;
class KthLargest{
	public static void main(String args[]){
		int[] arr={3,1,2,34,12,43,56,74,21};
		System.out.println("Enetred Array : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("\nWhich Position Smallest Number You Find : ");
		int num=sc.nextInt();
		System.out.println(num+"rd Smallest Number Present In array Is "+arr[num-1]);
	}
}