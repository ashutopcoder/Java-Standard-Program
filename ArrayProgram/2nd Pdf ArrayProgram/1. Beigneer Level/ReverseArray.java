//3. Write a program to reverse an array. 

class ReverseArray{
	public static void main(String args[]){
		int[] arr={10,20,30,40,50,60,70};
		System.out.println("\nEntered Elements : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nAfter Reverse An Array : ");
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
	}
}