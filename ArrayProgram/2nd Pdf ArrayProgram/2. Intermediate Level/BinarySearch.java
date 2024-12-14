//30. Write program to implement a binary search on an array. 
//The Array Must Be Sorted Form
import java.util.Scanner;
class BinarySearch{
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
		int[] arr={1,2,4,6,7,9,10};
		System.out.print("\nEntered Array : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Which Number You Find : ");
		int num=sc.nextInt();
		int ans=Binary(arr,num);
		if(ans==-1)
			System.out.println("Entered Number Is Not Present.");
		else
			System.out.println("Entered Number Is Present On Position "+(ans+1));
	}
}