//Sparse Matrix
public class SparseMatrix{
	public static void main(String args[]){
		int[][] m1={{1,0,0},{0,1,0},{1,2,3}};
		int number=0;
		int zero=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(m1[i][j]!=0)
					number++;
				else
					zero++;
			}
		}
		if(number<zero)
			System.out.print("Matrix Is A Sparse Matrix.");
		else
			System.out.print("Matrix Is Not A Sparse Matrix.");
			
	}
}