/*40. Write a program to find all the elements that appear more than n/3 times in an array.*/

class AppearNByThreeElement{
	public static int[] ar Check(int arr){
		int len=arr.length/3;
		int index=-1;
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
		}
	}
	public static void main(String args[]){
		int[] arr={1,2,3,1,2,4,4,56,78,90,1};
		
	}
}