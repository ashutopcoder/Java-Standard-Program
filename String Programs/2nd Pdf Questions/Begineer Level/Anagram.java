//5.Program to check if two strings are anagrams of each other. 

class Anagram{
	public static void main(String args[]){
		String str1="LISTEN";
		String str2="SILENT";
		int count=0;
		StringBuffer sb=new StringBuffer(str2);
		if(str1.length()==str2.length()){
			for(int i=0;i<str1.length();i++){
				for(int j=0;j<sb.length();j++){
					if(str1.charAt(i)==sb.charAt(j)){
						sb.setCharAt(j,'$');
						count++;
					}
				}
			}
			if(count==str1.length())
				System.out.println("Strings Are Anagram");
			else
				System.out.println("Strings Are Not Anagram");
				
		}
		else{
			System.out.println("Strings Are Not Equal So, Strings Are Not Anagram.");			
		}
	}
}