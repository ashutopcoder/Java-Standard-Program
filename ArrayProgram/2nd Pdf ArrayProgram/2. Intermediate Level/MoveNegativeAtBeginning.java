//23.Program to move all negative number to the beginning of an array. 

class MoveNegativeAtBeginning{
	public static void main(String args[]){
		int[] arr={1,-2,-3,40,50,43,-6};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]<arr[j]){
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
