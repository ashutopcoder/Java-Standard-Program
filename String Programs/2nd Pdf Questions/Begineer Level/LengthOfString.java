//1. Write a program to find the length of a string. 

class LengthOfString{
	public static void main(String args[]){
		String str="ABHISHEK";
		int count=0;
		System.out.println("Entered String Is : "+str);
		for(int i=0;i<str.length();i++){
			count++;
		}
		System.out.println("Length Of String : "+count);
	}
}