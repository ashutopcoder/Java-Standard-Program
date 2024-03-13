//Reverse String Without Using Reverse ():
public class ReverseStringWithoutReverseFun{
	public static void main(String args[]){
		String str="MOHAN IS GOOD BOY";
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}
	}
}