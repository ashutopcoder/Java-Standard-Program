//Sum Of All Elements Of An Array
public class SumOfElements{
	public static void main(String args[]){
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		System.out.print("Sum Of All Elements Of An Array : "+sum);
	}
}