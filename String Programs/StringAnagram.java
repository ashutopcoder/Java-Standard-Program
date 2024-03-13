//String Are Anagram:
public class StringAnagram{
	public static void main(String args[]){
		String str="LISTEN";
		String str1="SILENT";
		StringBuffer sb =new StringBuffer(str);
		int flag=0;
		int count=0;
		if(str.length()==str1.length()){
			for(int i=0;i<str.length();i++){
				for(int j=0;j<str.length();j++){
					if(str1.charAt(i)==sb.charAt(j)){
						sb.setCharAt(j,'$');
						count++;
						break;
					}
				}
				if(count==str1.length()){
					flag=1;
				}
			}
			if(flag==1)
				System.out.print("Strings Are Anagram");
			else
				System.out.print("String Are Not Anagram");
				
		}
		else
			System.out.println("Strings Are Not Anagram");
		
	}
}