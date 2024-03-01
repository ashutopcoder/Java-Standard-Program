//Print Array Element Present On Even Position

public class EvenPositionArray{
	public static void main(String args[]){
		int[] arr ={1,2,3,4,5,6,7,8,9,10};
		System.out.println("Entered Element : ");
		
		for(int i=0;i<arr.length;i++){
			System.out.println( arr[i]+" ");
			
		}
		System.out.println("Even Position Element : ");
		for(int i=1;i<arr.length;i++){
			System.out.println( arr[i]+" ");
			i=i+1;
		}
		
	}
}