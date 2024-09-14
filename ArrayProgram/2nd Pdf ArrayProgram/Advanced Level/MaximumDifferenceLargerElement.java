/*
41. Write a program to find the maximum difference between two elements in an array such that the larger element appears after the smaller one. 
*/

class MaximumDifferenceLargerElement{
	public static int Maximum(int[] arr){
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				int temp=max;
				max=arr[i];
			}
		}
		return max;
	}
		public static int Minimum(int[] arr){
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				int temp=min;
				min=arr[i];
			}
		}
		return min;
	}
	public static void main(String atgs[]){
		int[] arr={1,2,3,4,5,6,7,10,19,34,23,12,11};
		int max=Maximum(arr);
		int min=Minimum(arr);
		System.out.println("Maximum Difference B/W between Two Elements In An Array Such That The Larger Element Appears After The Smaller One : "+(min-max));
	}
}