//2. Program to count the number of vowels and consonants in a string. 

class CountVouwelAndCons{
	public static void main(String args[]){
		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int vouwel=0;
		int cons=0;
		for(int i=0;i<str.length();i++){
			if((str.charAt(i)=='A')||(str.charAt(i)=='E')||(str.charAt(i)=='I')||(str.charAt(i)=='O')||(str.charAt(i)=='U')){
				vouwel++;
			}
			else{
				cons++;
			}
		}
		System.out.println(vouwel+" Vouwel Present In String");
		System.out.println(cons+" Consonants Present In String");
	}
}