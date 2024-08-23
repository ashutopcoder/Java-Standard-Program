//17. Write a program to find the intersection of two arrays. 

class IntersactionArray{
	public static void main(String args[]){
		int[] arr1={1,3,4,6,78,90};
		int[] arr2={2,4,5,68,78,1};
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					System.out.print(arr2[j]+" ");
				}
			}
		}
	}
}