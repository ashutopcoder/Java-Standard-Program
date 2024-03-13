//Swap Two Strings Not Using Third String 
public class SwapString{
	public static void main(String args[]){
		String str1="AMAN";
		String str2="RAHUL";
		System.out.println("Entered String : ");
		System.out.println("String 1 : "+str1);
		System.out.println("String 2 : "+str2);
		
		
		str1 = str1+str2;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.println("Swap String :");
		System.out.println("String 1 : "+str1);
		System.out.println("String 2 : "+str2);
		
	}
}