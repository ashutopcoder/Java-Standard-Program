/*26. Write a program to find the number of occurrences of each element in an array. 
*/

class OccurancesOfElement{
	public static void main(String args[]){
		int[] arr={10,20,20,30,40,10,80};
		for(int i=0;i<arr.length;i++){
			int count=1;
			for(int j=i+1;j<arr.length;j++){
				if((arr[i]==arr[j])&&(arr[i]!=-1)){
					count++;
					arr[j]=-1;
				}
			}
			if(arr[i]!=-1)
			System.out.println(arr[i]+" Occurance Is "+count);
		}
	}
}