//12. Write a program to remove a specific character from a string. 
import java.util.Scanner;
class RemoveSpecificCharacter{
	public static void main(String args[]){
		String str="MOHAN IS A GOOD BOY.";
		System.out.println("\nEntered String : "+str);
		Scanner sc=new Scanner(System.in);
		System.out.println("\nWhich ELement Do You Want To Remove : ");
		char ch=sc.next().charAt(0);
		String newStr="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=ch){
				newStr+=str.charAt(i);
			}
		}
		System.out.println("\nAfter Removing Character : "+newStr);
	}
}
