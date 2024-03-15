//Binary Search In Java:If Values Must Be Sorted Otherwise 
//BSearch not Apply.
import java.util.Scanner;
public class BinarySearch{
	public static int Binary(int[] arr,int num){
		int start=0;
		int last=arr.length-1;
		while(start<last){
			int mid=(start+last)/2;
			if(num==arr[mid])
				return mid;
			if(num>arr[mid])
				start=mid;
			else
				last=mid;
		}
		return -1;
	}
	public static void main(String args[]){
	int[] arr={1,2,3,4,5,6,7,8,9,10};
	System.out.println("Entered Array : ");
	for(int i=0;i<arr.length;i++){
	System.out.print(arr[i]+" ");
	}
	Scanner sc =new Scanner(System.in);
	System.out.println("\nEnter A Number : ");
	int num = sc.nextInt();
	int index=Binary(arr,num);
	if(index==-1){
		System.out.println("Entered Number Is Not Present");
	}
	else
		System.out.println("Entered Number Present On Position : "+(index+1));
		
	}
}