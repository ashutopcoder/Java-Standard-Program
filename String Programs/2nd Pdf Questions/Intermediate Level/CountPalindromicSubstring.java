//22.Program to count the number of palindromic substrings in string. 

class CountPalindromicSubstring{
	public static Boolean Palindrome(String s1){
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
		String str="NAMAN SAYS MAM";
		String arr[]=str.split(" ");
		int count = 0;
		for(int i=0;i<arr.length;i++){
			boolean ans=Palindrome(arr[i]);
			if(ans)
				count++;
		}
		if(count>0)
			System.out.println("Palindrome Substring In String : "+count);
		else
			System.out.println("No Palindrome String Avilable");

	}
}