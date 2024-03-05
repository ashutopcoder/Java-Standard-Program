//Identity Matrix:
public class IdentityMatrix{
	public static void main(String args[]){
		int[][] m1={{1,0,0},{0,1,0},{0,0,1}};
		int flag=1;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
			if(i==j){
				if(m1[i][j]!=1)
					flag=0;
			}
			if(i!=j){
				if(m1[i][j]!=0)
					flag=0;
			}
			
			}
		}
		if(flag==1)
			System.out.print("Matix Is A Identity Matrix.");
		else
			System.out.print("Matrix Is A Not Identity Matrix");
	}
}