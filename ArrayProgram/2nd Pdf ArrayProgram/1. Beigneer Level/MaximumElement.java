//1. Write a program to find the maximum element in an array. 

class MaximumElement{
	public static void main(String args[]){
		int[] arr={20,12,34,54,123,321,144};
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println("\nEntered Elements : ");
		for(int j=0;j<arr.length;j++){
			System.out.print(arr[j]+" ");
		}
		System.out.println("\n\nMAXIMUM VALUE IN ARRAY IS : "+max);
	}
}