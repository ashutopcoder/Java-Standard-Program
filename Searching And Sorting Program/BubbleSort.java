//Bubble Sort In Java 
public class BubbleSort{
	public static void main(String args[]){
		int[] arr={3,4,5,1,2,10,8,9,6,7};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]<arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}