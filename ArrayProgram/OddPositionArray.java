//Print Array Element Present On Odd Position

public class OddPositionArray{
	public static void main(String args[]){
		int[] arr ={1,2,3,4,5,6,7,8,9,10};
		System.out.println("Entered Element : ");
		
		for(int i=0;i<arr.length;i++){
			System.out.println( arr[i]+" ");
			
		}
		System.out.println("Odd Element : ");
		for(int i=0;i<arr.length;i++){
			System.out.println( arr[i]+" ");
			i=i+1;
		}
		
	}
}