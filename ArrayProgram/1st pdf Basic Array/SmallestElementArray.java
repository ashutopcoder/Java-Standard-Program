//Smallest Element In Array
public class SmallestElementArray{
	public static int SmallestNumber(int[] ar){
		int small=ar[0];
		for(int i=1;i<ar.length;i++){
			if(ar[i]<small){
				small=ar[i];
			}
		}
			return small;
	}
	public static void main(String args[]){
		int[] arr={11,2,3,4,5,1,0,-1,7,8,9,10};
		int ans=SmallestNumber(arr); 
		System.out.println("Smallest Value Is : "+ans);
	}
}