/*lower-case characters with upper-case and vice-versa
ASCII Value-
a-z=97-122
A-Z=65-90
*/
public class LowerUpperViceVersaString{
	public static void main(String args[]){
		String str="AmanKumar";
		for(int i=0;i<str.length();i++){
			if((int)str.charAt(i)>=97)
				System.out.print((char)(str.charAt(i)-32));
			else
				System.out.print((char)(str.charAt(i)+32));
				
		}
	}
}
