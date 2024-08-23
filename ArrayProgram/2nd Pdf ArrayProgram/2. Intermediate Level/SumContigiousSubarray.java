//28. Program to find the contiguous subarray with te minimum sum. 

class SumContigiousSubarray{
	public static void main(String args[]){
		int[] arr={1,2,3,4,8,6,7};
		int sum = 0;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]+1==arr[i+1])
				sum+=arr[i];
		}
		System.out.println("Addition Of Minimum Contigious SubArray : "+sum);
	}
}