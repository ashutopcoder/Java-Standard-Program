//Insertion Sort :
public class InsertionSort{
	public static void main(String args[]){
		int[] arr={3,21,1,5,7,89,2,4,8};
			System.out.println("Entered Array : ");
			for(int i=0;i<arr.length;i++)
				System.out.print(arr[i]+" ");
			for(int i=0;i<arr.length;i++){
				for(int j=i;j>0;j--){
					if(arr[j]<arr[j-1]){
						int temp=arr[j];
						arr[j]=arr[j-1];
						arr[j-1]=temp;
					}
				}
			}
			System.out.println("\nSorted Array : ");
			for(int i=0;i<arr.length;i++)
				System.out.print(arr[i]+" ");
	}
} 