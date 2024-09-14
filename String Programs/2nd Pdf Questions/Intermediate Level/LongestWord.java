//17. Write a program to find the longest word in a string. 

class LongestWord{
	public static void main(String args[]){
		String str="RAM IS A GOOD BOY";
		System.out.println("Entered String : "+str);
		String word="";
		String Lword="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=' '){
				word+=str.charAt(i);
			}
			else{
				if(word.length()>Lword.length()){
					Lword=word;
				}
				word="";
			}
		}
		System.out.println("Longest Word : "+Lword);
	}
}