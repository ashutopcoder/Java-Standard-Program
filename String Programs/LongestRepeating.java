//Longest Repeating Sequence In String :
public class LongestRepeating{
	public static void main(String args[]){
		String str="HELLOINDIAHELLOWORLD";
		int len=0;
		for(int i=0;i<str.length();i++){
			int count=0;
			int m=i;
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(m)==str.charAt(j)){
				count++;
				m++;
				}
			}
			if(count>len)
				len=count;
		}
		System.out.print("\nLongest Repeating String Length :"+len);
	}
}