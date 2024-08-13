//Largest Element In An Array
public class LargestElementArray{
	public static int LargestNumber(int[] ar){
		int large =ar[0];
		for(int i=1;i<ar.length;i++){
			if(ar[i]>large){
				large=ar[i];
			}
		}
		return large;
	}
	public static void main(String args[]){
		int[] arr={2,20,4,10,6,7,3};
		int ans=LargestNumber(arr);
		System.out.print("Largest Value In Array Is : "+ans);
	}
}