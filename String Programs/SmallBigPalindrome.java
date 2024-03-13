//small and big possible palindrome word in a given string
public class SmallBigPalindrome{
	public static boolean Palindrome(String str){
		int start=0;
		int last=str.length()-1;
		while(start<last){
			if(str.charAt(start)!=str.charAt(last))
				return false;
			start++;
			last--;
		}
		return true;
	}
	public static void main(String args[]){
		String str="NAMAN SAYS MAM CALLED ROHAN";
		String min="";
		String max="";
		String[] s1=str.split(" ");
		for(int i=0;i<s1.length;i++){
		if(Palindrome(s1[i])){
			if(min.length()>s1[i].length()||(min==""))
				min=s1[i];
			if(max.length()<s1[i].length()||(max==""))
				max=s1[i];
			
		}
	    }
		System.out.println("Maximum Length Palindrome : "+max);
		System.out.println("Minimum Length Palindrome : "+min);
		
	}
}