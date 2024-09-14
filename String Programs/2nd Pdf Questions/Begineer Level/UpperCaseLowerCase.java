//6. Write a program to convert a string to uppercase and lowercase. 

class UpperCaseLowerCase{
	public static void main(String args[]){
		String str="Ram Is Good Boy";
		System.out.println("\nEntered String : "+str);
		for(int i=0;i<str.length();i++){
			if((int)str.charAt(i)>=97)
				System.out.print((char)(str.charAt(i)-32));
			else
					System.out.print((char)(str.charAt(i)+32));
		}
	}
}