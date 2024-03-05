//Matrix Program To Print Matrix[3][3];

public class MatrixProgram{
	public static void main(String args []){
		int[][] m1={{10,12,14},{11,22,33},{22,33,44}};
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
			System.out.print(m1[i][j]+" ");
			}
			System.out.println();
		}
	}
}