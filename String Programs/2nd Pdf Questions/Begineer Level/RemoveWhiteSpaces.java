//9. Write a program to remove all whitespace from a string. 

class RemoveWhiteSpaces{
	public static void main(String args[]){
		String str="My Name Is Abhisek Chauhan";
		System.out.println("Entered STring : "+str);
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=' '){
				System.out.print(str.charAt(i));
			}
		}
	}
}