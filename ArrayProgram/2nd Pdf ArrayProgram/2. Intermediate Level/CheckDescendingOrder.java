//21. Program to check if an array is sorted in descending order. 

class CheckDescendingOrder{
	public static boolean checkDescending(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j])
					return false;
			}
		}
		return true;
	}
	public static void main(String args[]){
		int[] arr={10,20,30,40,50,60};
		boolean ans=checkDescending(arr);
		if(ans==true){
			System.out.println("Entered Array Is In Descending Order");
		}
		else
			System.out.println("Entered Array Is Not In Descending Order");
	}
}