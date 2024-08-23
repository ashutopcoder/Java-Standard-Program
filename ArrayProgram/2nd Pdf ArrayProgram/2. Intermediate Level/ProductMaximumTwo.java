//24.Program to find the maximum product of two elements in an array. 

class ProductMaximumTwo{
	public static void main(String args[]){
		int[] arr={10,20,1,4,5,70,50,30};
		System.out.println("Entered Array : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("\nSorted Array : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		int ans=arr[0]*arr[1];
		System.out.println("\n\nProduct Of Two Maximum Number In Array Is "+ans);
	}
}