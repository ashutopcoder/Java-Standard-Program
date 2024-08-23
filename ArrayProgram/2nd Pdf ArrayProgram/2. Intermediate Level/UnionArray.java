//18. Write a program to find the union of two arrays. 

class UnionArray{
	public static void main(String args[]){
		int[] arr1={12,32,4,5,686,1,3};
		int[] arr2={1,2,4,5,6,12,32};
		int[] newarr=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++){
			newarr[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++){
			newarr[arr1.length+i]=arr2[i];
		}
		for(int i=0;i<newarr.length;i++){
			for(int j=i+1;j<newarr.length;j++){
				if((newarr[i]==newarr[j])&&(newarr[i]!=-1)){
					newarr[j]=-1;
				}
			}
		}
		System.out.println("\nUnion Array : ");
		for(int i=0;i<newarr.length;i++){
			if(newarr[i]!=-1){
				System.out.print(newarr[i]+" ");
			}
		}
	}
}