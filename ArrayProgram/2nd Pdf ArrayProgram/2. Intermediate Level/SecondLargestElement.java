//11. Write a program to find the second largest element in an array. 

class SecondLargestElement{
	public static void main(String args[]){
		int[] arr={1,2,3,4,5,12,32,45,23,34,9};
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("\n\nSecond Largest Element In Array : "+arr[1]);
	}
}