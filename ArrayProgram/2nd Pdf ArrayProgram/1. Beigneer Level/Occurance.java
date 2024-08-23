/*6. Write a program to count the occurrence of a particular element in an array. 
*/

class Occurance{
	public static void main(String args[]){
		int[] arr={10,11,10,20,11,45,46,10};
		for(int i=0;i<arr.length;i++){
			int count=1;
			for(int j=i+1;j<arr.length;j++){
			if((arr[i]==arr[j])&&(arr[i]!=-1)){
				count++;
				arr[j]=-1;
			}
			}
			if(arr[i]!=-1){
			System.out.println(arr[i]+" Occourancy Is "+count);
			}
		}
	}
}