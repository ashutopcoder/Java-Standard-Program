/*
1 1 1 1 1 
1 2 1 1 1 
1 1 3 1 1 
1 1 1 4 1 
1 1 1 1 5
*/
class Pattern18{
	public static void main(String args[]){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i==j)
					System.out.print(j+" ");
				else
					System.out.print(1+" ");
			}
			System.out.println();
		}
	}
}