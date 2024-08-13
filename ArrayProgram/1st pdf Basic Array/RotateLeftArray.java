//Rotate Left Array 
import java.util.Scanner;
public class RotateLeftArray{
	public static int[] LeftRev(int[] ar,int x){
		for(int i=0;i<x;i++){
			int temp=ar[0];
			for(int j=0;j<ar.length-1;j++){
				ar[j]=ar[j+1];
			}
			ar[ar.length-1]=temp;
		}
		return ar;
	}
	public static void main(String args[]){
		int arr[]={1,2,3,4,5,6,7,8};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter How Many Times To Reverse : "); 
		int num=sc.nextInt();
		int[] newArr = LeftRev(arr,num);
		for(int i=0;i<newArr.length;i++){
			System.out.print(newArr[i]+" ");
		}
	}
}