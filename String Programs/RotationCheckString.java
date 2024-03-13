// one string is a rotation of another
public class RotationCheckString{
	public static void main(String args[]){
		String str="ABCD";
		String str1="CDAB";
		String temp=str+str;
		if(temp.indexOf(str1)!=-1)
			System.out.println("Strings Are Rotation.");
		else
			System.out.println("Strings Are Not Rotation.");
			
	}
}
