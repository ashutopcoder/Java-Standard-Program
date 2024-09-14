//String Palindrome
public class PalindromeString{
	public static void main(String args[]){
		String str="mam";
		String str2 = "";
		for(int i=str.length()-1;i>=0;i--){
			str2=str2+str.charAt(i);
		}
		if(str.equals(str2))
			System.out.print("Strings Are Palindrome");
		else
			System.out.print("Strings Are Not Palindrome");
			
	}
}
