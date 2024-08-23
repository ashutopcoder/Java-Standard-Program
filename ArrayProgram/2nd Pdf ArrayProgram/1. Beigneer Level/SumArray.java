//4. Write a program to find the sum of all elements in an array. 

class SumArray{
	public static void main(String args[]){
		int[] arr={10,20,30,40,50};
		int sum=0;
		for(int i=0;i<arr.length;i++){
				sum=sum+arr[i];
		}
		System.out.println("Entered Elements : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nSUM OF ELEMENTS : "+sum);
	}
}