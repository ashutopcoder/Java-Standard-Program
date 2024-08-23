//2. Write a program to find the minimum element in an array. 

class MinimumElement{
	public static void main(String args[]){
		int[] arr={20,12,34,54,123,321,144};
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("\nEntered Elements : ");
		for(int j=0;j<arr.length;j++){
			System.out.print(arr[j]+" ");
		}
		System.out.println("\n\nMINIMUM VALUE IN ARRAY IS : "+min);
	}
}