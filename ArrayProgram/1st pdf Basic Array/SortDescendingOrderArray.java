//Array Sorting In Descending order
public class SortDescendingOrderArray{
	public static int[] SortingDes(int[] ar){
		for(int i=1;i<ar.length;i++){
			for(int j=0;j<ar.length;j++){
				if(ar[j]<ar[i]){
					ar[i]=ar[j]+ar[i];
					ar[j]=ar[i]-ar[j];
					ar[i]=ar[i]-ar[j];
					
				}
			}
		}
		return ar;
	}
	public static void main(String args[]){
		int [] arr={1,2,4,3,5,8,10,24,13,11,32};
		int[] newArr=SortingDes(arr);
		for(int i=0;i<newArr.length;i++){
			System.out.print(newArr[i]+" ");
		}
	}
}