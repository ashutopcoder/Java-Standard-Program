//Rotate The Elements Of An Array.
import java.util.Scanner;
public class RotateRightArray{
	public static int[] RightRotate(int[] ar,int r){
		for(int i=0;i<r;i++){
			int temp = ar[ar.length-1];
			for(int j=ar.length-1;j>0;j--){
				ar[j]=ar[j-1];
			}
			ar[0]=temp;
		}
		return ar;
	}
	public static void main(String args[]){
		int arr[]={1,2,3,4,5,6,7,8};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter How Many Times To Rorate : ");
		int num=sc.nextInt();
		int[] newArr = RightRotate(arr,num);
		for(int i=0;i<newArr.length;i++){
			System.out.print(newArr[i]+" ");
		}
	}
}