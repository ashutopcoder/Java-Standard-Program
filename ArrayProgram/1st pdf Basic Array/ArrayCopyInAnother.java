//Array Program To Copy Into Another Array

public class ArrayCopyInAnother{
	public static void main(String args[]){
		int arr[]={2,3,4,5,6};
		int arr1[]=new int[arr.length];
			for(int i=0;i<arr.length;i++){
				arr1[i]=arr[i];
			}
			for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
			}
	}
}