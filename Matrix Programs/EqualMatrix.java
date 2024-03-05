//Check Weather Two Matrix Are Equal
public class EqualMatrix{
	public static boolean CheckEqual(int[][] ar1,int[][] ar2){
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					if(ar1[i][j]!=ar2[i][j])
						return false;
				}
			}
			return true;
	}
	public static void main(String args[]){
		int[][] m1={{1,2,3},{4,5,6},{7,8,9}};
		int[][] m2={{1,2,3},{4,5,6},{8,8,9}};
		boolean ans=CheckEqual(m1,m2);
		if(ans==true)
			System.out.print("Matrix Are Equals.");
		else
			System.out.print("Matrix Are Not Equals.");
		
	}
}