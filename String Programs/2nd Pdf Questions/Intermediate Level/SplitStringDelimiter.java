//15. Write a program to split a string into substrings based on a delimiter. 

class SplitStringDelimiter{
	public static void main(String args[]){
		String str="MOHAN##IS#####GOOD#BOY";
		String[] s1=str.split("#");
		for(int i=0;i<s1.length;i++){
			if(s1[i].length()!=0)
				System.out.println(s1[i]);
		}
	}
}