//16. Write a program to check if a string contains only digits. 

class StringContainsOnlyDigit{
	public static void main(String args[]){
		String str="123456";
		int flag=1;
		for(int i=0;i<str.length();i++){
			if(!(((int)(str.charAt(i))<=48)||((int)(str.charAt(i))>=58))){
				flag=0;
			}
		}
		if(flag==1)
			System.out.println("Only Digit Are Present In String .");
		else
			System.out.println("Alphabet Are Present In String .");
	}
}