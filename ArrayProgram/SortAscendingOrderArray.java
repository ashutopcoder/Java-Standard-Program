//Array Sort In Ascending Order.
public class SortAscendingOrderArray{
	public static int[] Sorting(int[] ar){
		for(int i=1;i<ar.length;i++){
			for(int j=0;j<ar.length;j++){
				if(ar[i]<ar[j]){
					ar[j]=ar[j]+ar[i];
					ar[i]=ar[j]-ar[i];
					ar[j]=ar[j]-ar[i];
				}
			}
		}
		return ar;
	}
	public static void main(String args[]){
		int[] arr={9,5,6,7,1,8,11,3,2,4,10};
		int[] newArr=Sorting(arr);
		for(int i=0;i<newArr.length;i++){
			System.out.print(newArr[i]+" ");
		}
	}
}
