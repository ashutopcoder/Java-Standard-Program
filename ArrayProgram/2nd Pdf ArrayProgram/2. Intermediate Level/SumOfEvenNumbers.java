//13. Write a program to find the sum of all even numbers in an array. 

class SumOfEvenNumbers{
	public static void main(String args[]){
		int[] arr={1,2,3,4,5,6,7,3,5,1,10};
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		int sum=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				sum=sum+arr[i];
			}
		}
		System.out.println("\nSum Of EvenNumbers : "+sum);
	}
}