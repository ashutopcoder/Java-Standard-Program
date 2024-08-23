//36. Write a program to implement bubble sort on an array. 

class BubbleSort{
	public static void main(String args[]){
		int[] arr={12,2,3,1,45,67,34,98,10};
		System.out.println("\n Entered Array : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]<arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("\nSorted Array : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}