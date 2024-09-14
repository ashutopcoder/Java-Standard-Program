//10. Program to find the frequency of a character in a string. 

class FrequencyOfCharacter{
	public static void main(String args[]){
		String str="RAM IS A GOOD BOY";
		char ch='A';
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch){
				count++;
			}
		}
		System.out.println("Frequency Of Charcater "+ch+" Is "+count);
	}
}