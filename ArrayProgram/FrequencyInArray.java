/*Frequency Of Element :Each Element In An Array How Many 
Times Number Is Repeated.
All The Values Are In Positive Or All Negative.
*/
public class FrequencyInArray{
	public static void main(String args[]){
		int arr[]={3,3,6,4,6};
		for(int i=0;i<arr.length;i++){
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			if(arr[i]==arr[j] && arr[j]!=-1){
				arr[j]=-1;
			count++;			
			}
			if(arr[i]!=-1)
			System.out.println(arr[i]+" = "+count);
			
		}
	}
}