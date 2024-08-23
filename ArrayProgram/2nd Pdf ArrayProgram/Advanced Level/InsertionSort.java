//34. Write a program to implement insertion sort on an array. 

class InsertionSort{
	public static void main(String args[]){
		int[] arr={4,5,1,3,2,8,11,9};
		System.out.println("\nEntered Array : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++){
			for(int j=i;j>0;j--){
				if(arr[j]<arr[j-1]){
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		System.out.println("\n Sorted Array : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}