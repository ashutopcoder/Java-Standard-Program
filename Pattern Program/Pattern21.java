/*
E D C B A
E D C B A
E D C B A
E D C B A
E D C B A

*/
class Pattern21{
	public static void main(String args[]){
		for(int i=1;i<=5;i++){
			for(char j='E';j>='A';j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}