/*
1 1 1 1 1 
2 2 1 1 1 
3 3 3 1 1
4 4 4 4 1
5 5 5 5 5 
*/
class Pattern20{
	public static void main(String args[]){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i);
			}
			for(int k=4;k>=i;k--)
				System.out.print(1);
			System.out.println();
		}
	}
}