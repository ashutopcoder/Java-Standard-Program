/*39. Write a program to find the majority element in an array (an element that appears 
more than n/2 times). 
*/

class MajorityElement{
	public static void main(String args[]){
		int index=-1;
		int[] arr={2,3,1,2,2,4,5,6,2,201,202,222,1};
		int len=arr.length/2;
		for(int i=0;i<arr.length;i++){
			int count=1;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(count>=len){
				index=i;
			}else
			{
				index=-1;
			}
		}
		if(index!=-1)
			System.out.println("Majority Element Is "+arr[index]);
		else
			System.out.println("No Majority Element Is found.");
			
	}
}