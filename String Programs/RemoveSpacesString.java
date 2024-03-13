//Program To Remove White Spaces
public class RemoveSpacesString{
	public static void main(String args[]){
		String str="RAMAN IS A GOOD BOY";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=' ')
				System.out.print(str.charAt(i));
		}
	}
}