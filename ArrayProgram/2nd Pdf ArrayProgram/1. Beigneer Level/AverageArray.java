//5. Write a program to find the average of elements in an array. 

class AverageArray{
	public static void main(String args[]){
		int[] arr={10,20,30,40,50};
		int sum=0;
		int count=0;
		int avg=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
			count++;
		}
		avg=sum/count;
		System.out.println("\nAVERAGE OF AN ARRAY : "+avg);
	}
}