//20. Write a program to find all the substrings of a string. 

class SubstringOfString{
	public static void main(String args[]){
		String str="ABHISHEK";
		for(int i=0;i<str.length();i++){
			System.out.println(str.substring(0,i+1));
		}
	} 
}