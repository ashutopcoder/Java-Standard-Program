//Program To Subtract Two Matrix 
public class SubtractMatrix{
	public static void main(String args[]){
		int[][] m1={{100,200,300},{400,500,600},{700,800,900}};
		int[][] m2={{10,20,30},{40,50,60},{70,80,90}};
		System.out.println("Subtraction Of Matrix : ");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(m1[i][j]-m2[i][j]+" ");
			}
			System.out.println();
		}
	} 
}