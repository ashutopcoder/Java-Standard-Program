//Find Reverse Of A String 
public class ReverseString{
	public static void main(String args[]){
		String str = "RAHULKUMAR";
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}
	}
}