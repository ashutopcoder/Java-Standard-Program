//Program To Multply Two Matrix 
public class MultplyMatrix{
	public static void main(String args[]){
		int[][] m1={{10,20,30},{4,5,6},{7,8,9}};
		int[][] m2={{10,20,30},{40,50,60},{70,80,90}};
		System.out.println("Multplication Of Matrix : ");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(m1[i][j]*m2[i][j]+" ");
			}
			System.out.println();
		}
	} 
}