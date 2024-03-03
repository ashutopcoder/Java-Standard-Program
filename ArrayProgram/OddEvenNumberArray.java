//Print Odd And Even Number From An Array
public class OddEvenNumberArray{
	public static void main(String args[]){
		int flag=0;
		int[] arr={2,3,4,5,6,7,8,9,10,11,12,13,14};
		System.out.println("Even");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
			System.out.print(arr[i]+" ");
			}
		}
		System.out.println("\nOdd");
			
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0){
			System.out.print(arr[i]+" ");
			}
		}
		
	}
}