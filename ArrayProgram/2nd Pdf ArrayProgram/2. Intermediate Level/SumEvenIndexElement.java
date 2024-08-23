//15. Program to find the sum of elements at even indices in an array. 

class SumEvenIndexElement{
	public static void main(String args[]){
		int[] arr={1,1,3,2,4,5,8,7,10};
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		int sum=0;
		for(int i=1;i<arr.length;i=i+2){
			sum=sum+arr[i];
		}
		System.out.println("\nAddition Of Even Position Elements : "+sum);
	}
}