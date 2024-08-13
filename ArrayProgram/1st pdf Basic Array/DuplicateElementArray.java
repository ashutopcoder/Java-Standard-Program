//Repeating Element Print 
//This is only for positive array
public class DuplicateElementArray{
	public static void main(String args[]){
		int[] arr={1,2,1,2,3,4,5,4};
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					System.out.println(arr[i]);
				}
				
			}
			
		}
	}
}