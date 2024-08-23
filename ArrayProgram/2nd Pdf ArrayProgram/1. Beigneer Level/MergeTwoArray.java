//10. Write a program to merge two arrays into a single array. 

class MergeTwoArray{
	public static void main(String args[]){
		int[] arr1={1,2,3,4};
		int[] arr2={10,20,30,40};
		int[] mergeArray=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++){
			mergeArray[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++){
			mergeArray[arr1.length+i]=arr2[i];
		}
		for(int i=0;i<mergeArray.length;i++){
			System.out.print(mergeArray[i]+" ");
		}
		
	}
}