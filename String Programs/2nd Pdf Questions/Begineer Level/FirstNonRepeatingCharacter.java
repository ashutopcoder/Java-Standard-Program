//7. Program to find the first non-repeated character in a string. 

class FirstNonRepeatingCharacter{
	public static void main(String args[]){
		String str="ABCDAB";
		char character = '$';
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			int count = 1;
			for(int j=i+1;j<str.length();j++){
				if(ch==str.charAt(j))
					count++;
			}
			if(count==1){
				character=ch;
				break;
			}
		}
			if(character=='$')
				System.out.println("Character Not Found!");
			else
				System.out.println("Character is : "+character);
	}
}