//18. Write a program to find the most frequent character in a string. 

class MostFrequentCharacter{
	public static void main(String args[]){
		String str="ABCDABBDABBARGH";
		char ch=' ';
		int len=0;
		for(int i=0;i<str.length();i++){
			int count=0;
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					count++;
				}
			}
			if(count>len){
				len=count;
				ch=str.charAt(i);
			}
		}
		System.out.println("Maximum Occuring Character In String : "+ch);
	}
}