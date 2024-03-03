//Remove Duplicate Elements In Array 
public class RemoveDuplicateInArray{
	public static int[] Check(int[] ar){
		for(int i=0;i<ar.length;i++){
			for(int j=i+1;j<ar.length;j++){
				if(ar[i]==ar[j] && ar[j]!=-1)
					ar[j]=-1;
			}
		}
		return ar;
	}
	public static void main(String args[]){
		int[] arr={2,3,4,5,6,7,7,2,2,3,3,1,17};
		int[] newArr=Check(arr);
		for(int i=0;i<newArr.length;i++){
			if(newArr[i]!=-1)
			System.out.print(newArr[i]+" ");
		}
	}
}