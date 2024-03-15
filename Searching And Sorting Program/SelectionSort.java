//Selection Sort : 
public class SelectionSort{
	public static void main(String args[]){
		int[] arr={2,3,4,5,6,7,1,9,8,10};
		System.out.print("\nOur Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
			
		for(int i=0;i<arr.length;i++){
			int min=arr[i];
			int index=i;
			for(int j=i;j<arr.length;j++){
				if(min>arr[j]){
					min=arr[j];
					index=j;
				}
			}
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		}
		
		System.out.print("\nSorted Array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}