//Count Character In String
import java.util.Scanner;
public class CountCharacter{
public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter A String : ");
	String str =sc.next();
	int count=0;
	for(int i=0;i<str.length();i++){
		if((str.charAt(i)!=' ')&&(str.charAt(i)!='@')&&(str.charAt(i)!='$')&&(str.charAt(i)!='.'))
			count++;
	}
	System.out.println("Character In A String Is : "+count);
	}
}