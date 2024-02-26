package com.demo;

public class Anagram {
	public static boolean CheckAnagram(String str1,String str2) {
		StringBuffer str = new StringBuffer(str1);
		int count = 0;
		if(str1.length()!=str2.length())
			return false;
		for(int i=0;i<str2.length();i++) {
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)==str2.charAt(i)) {
					count++;
					str.setCharAt(j,'$');
				}
			}
		}
		if(count==str2.length())
			return true;
		return false;
	}
	public static void main(String [] args) {
		String str1 = "SILENT";
		String str2 = "LISTEN";
		if(Anagram.CheckAnagram(str1, str2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
	}

}
