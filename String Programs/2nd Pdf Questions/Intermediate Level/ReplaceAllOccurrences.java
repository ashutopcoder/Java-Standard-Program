/*11. Write a program to replace all occurrences of a character in a string with another character. 
*/
import java.util.Scanner;
class ReplaceAllOccurrences{
	public static void main(String args[]){
		String str="ABHISHEK CHAUHAN";
		System.out.println("Before Replace : "+str);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Character Which You Want To Replace With $: ");
		char ch=sc.next().charAt(0);
		StringBuffer sb=new StringBuffer(str);
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i)==ch){
				sb.setCharAt(i,'$');
			}
		}
		System.out.println("After Replace : "+sb);
	}
}