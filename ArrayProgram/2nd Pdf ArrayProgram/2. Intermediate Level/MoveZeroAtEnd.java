//22. Write a program to move all zeros to the end of an array. 

class MoveZeroAtEnd{
	public static void main(String args[]){
		int[] arr={1,2,0,3,40,50,0,43,0,6};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}