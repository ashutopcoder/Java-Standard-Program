//Smallest Number in Array
public class SmallestValueArray{
	public static int[] Ascending(int[] ar){
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
		int[] arr={34,45,67,32,12,11,22,333,111,67,98,101,55};
		int[] newArr=Ascending(arr);
		for(int i=0;i<=0;i++){
			System.out.print("The Smallest Value In Array Is : "+newArr[0]);
		}
	}
}