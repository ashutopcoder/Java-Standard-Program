//21. Program to find the longest palindromic substring in a string. 

class LongestPalindromicSubstring{
	public static boolean Palindrome(String s1){
		String s2="";
		for(int i=s1.length()-1;i>=0;i--){
			s2+=s1.charAt(i);
		}
		if(s1.equals(s2)){
			return true;
		}
		return false;
	}
	public static void main(String args[]){
		String str="NAMAN ASK MAM";
		String Lpalin = "M";
		int count=0;
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++){
			boolean ans=Palindrome(arr[i]);
			if(ans)
				count=arr[i].length();
			if(count>Lpalin.length())
				Lpalin=arr[i];
		}
		System.out.println("Longest Palindrome String : "+Lpalin);
	}
}