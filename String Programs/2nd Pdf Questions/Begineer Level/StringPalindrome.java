//4. Write a program to check if a string is a palindrome. 

class StringPalindrome{
	public static void main(String args[]){
		String str1="MADAM";
		String str2="";
		for(int i=str1.length()-1;i>=0;i--){
			str2+=str1.charAt(i);
		}
		if(str1.equals(str2))
			System.out.println("String Are Palindrome");
		else
			System.out.println("String Are Not Palindrome");
	}
}