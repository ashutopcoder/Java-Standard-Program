//find maximum and minimum occurring character in a string.
public class MaxMinChracterOccuring{
	public static char Maximum(String s1){
		char ch = ' ';
		int len=0;
		for(int i=0;i<s1.length();i++){
			int count=0;
			for(int j=i+1;j<s1.length();j++){
				if(s1.charAt(i)==s1.charAt(j))
					count++;
			}
			if(count>len){
				len=count;
				ch=s1.charAt(i);
			}
		}
		return ch;
	}
		public static char Minimum(String s2){
		char ch = ' ';
		int len=s2.length();
		for(int i=0;i<s2.length();i++){
			int count=0;
			for(int j=i+1;j<s2.length();j++){
				if(s2.charAt(i)==s2.charAt(j))
					count++;
			}
			if(count<len){
				len=count;
				ch=s2.charAt(i);
			}
		}
		return ch;
	}
	public static void main(String args[]){
		String str="ABCAACASS";
		char max=Maximum(str);
		char min=Minimum(str);
		System.out.println("Maximum Repeating Chracter Is : "+max);
		System.out.println("Minimum Repeating Chracter Is : "+min);
		
	}
}
