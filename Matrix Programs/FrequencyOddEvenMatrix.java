//Frequency Of Odd And Even Element : 
public class FrequencyOddEvenMatrix{
	public static void main(String args[]){
		int[][] m1={{1,2,3},{4,5,6},{7,8,9}};
		int even=0;
		int odd=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(m1[i][j]%2==0){
				even++;
				}
				else
				odd++;			
			}		
		}
		System.out.println("Even Number Frequency : "+even);
		System.out.print("Odd Number Frequency : "+odd);
	}
}