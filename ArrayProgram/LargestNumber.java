//Find Largest Number in Array
public class LargestNumber{
	public static int BiggestNumber(int[] ar){
		int large=ar[0];
		for(int i=1;i<ar.length;i++){
			if(ar[i]>large){
				large=ar[i];
			}
		}
		return large;
	}
	public static void main(String args[]){
	int[] arr={1,222,3,420,5,623,223,321,111,456,223,};
	 int ans =BiggestNumber(arr);
	 System.out.print("LargestNumber Is : "+ans);
	}
}