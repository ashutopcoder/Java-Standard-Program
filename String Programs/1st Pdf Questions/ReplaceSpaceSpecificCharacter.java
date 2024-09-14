//Replace the spaces of a string with a specific character
import java.util.Scanner;
public class ReplaceSpaceSpecificCharacter{
	public static void main(String args[]){
		String str="MY NAME IS ABHISHEK CHAUHAN";
		StringBuffer sb =new StringBuffer(str);
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter A Special Character : ");
		char ch=sc.next().charAt(0);
		for(int i=0;i<str.length();i++){
			if(sb.charAt(i)==' '){
				sb.setCharAt(i,ch);
			}
		}
		System.out.print(sb);
	}
}