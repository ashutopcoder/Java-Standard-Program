//Reverse String Word By Word : 
public class StringWordByWord{
	public static String Reverse(String str){
		String temp="";
		for(int i=str.length()-1;i>=0;i--){
				temp=temp+str.charAt(i);
		}
		return temp;
	}
	public static void main(String args[]){
		String str ="MOHAN IS GOOD BOY";
		String[] s1=str.split(" ");
		for(int i=0;i<s1.length;i++){
		String ans=Reverse(s1[i]);
		System.out.print(ans+" ");
		}
	}
}