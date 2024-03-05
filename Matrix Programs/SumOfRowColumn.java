//Sum Of Each Row And Each Column
public class SumOfRowColumn{
	public static int[] SumRow(int[][] ar1){
		int ans=0;
		int[] arr1=new int[3];
		for(int i=0;i<3;i++){
			ans=0;
			for(int j=0;j<3;j++){
				ans=ans+ar1[i][j];
				
			}
				arr1[i]=ans;
		}
		return arr1;
	}
	public static int[] SumCol(int[][] ar1){
		int ans=0;
		int[] arr1=new int[3];
		for(int i=0;i<3;i++){
			ans=0;
			for(int j=0;j<3;j++){
				ans=ans+ar1[j][i];
				
			}
				arr1[i]=ans;
		}
		return arr1;
	}
	public static void main(String args[]){
		int[][] m1={{1,2,3},{4,5,6},{7,8,9}};
		int[] rs=SumRow(m1);
		int[] cs=SumCol(m1);
			System.out.println("Row Sum : ");
		for(int i=0;i<rs.length;i++){
			System.out.print(rs[i]+" ");
		}
			System.out.println();
			System.out.println("Columns Sum : ");
		for(int k=0;k<cs.length;k++)
			System.out.print(cs[k]+" ");
	}
}