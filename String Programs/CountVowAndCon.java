// Count Vowels And consonants
public class CountVowAndCon{
	public static void main(String args[]){
		String str="ClassmateBooks";
		int count1=0;
		int count2=0;
		for(int i=0;i<str.length();i++){
			if((str.charAt(i)=='A')||(str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='E')||(str.charAt(i)=='I')||(str.charAt(i)=='i')||(str.charAt(i)=='O')||(str.charAt(i)=='o')||(str.charAt(i)=='u')||(str.charAt(i)=='U'))
			{
				count1++;
			}
			else
				count2++;
		}
		System.out.print("Vouwels Is : "+count1);
		System.out.print("Consonants Is : "+count2);
			
	}
}	