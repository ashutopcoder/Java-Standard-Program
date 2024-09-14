//Find Largest And Smallest Word In String :
public class SmallestLargestWordInString{
	public static String Maximum(String str1){
		String[] sr=str1.split(" ");
		String max=sr[0];
		for(int i=0;i<sr.length;i++){
				if(max.length()<sr[i].length())
					max=sr[i];
		}
		return max;
	}
	public static String Minimum(String str2){
		String[] sr=str2.split(" ");
		String min=sr[0];
		for(int i=0;i<sr.length;i++){
				if(min.length()>sr[i].length())
					min=sr[i];
		}
		return min;
	}
	
	
	public static void main(String args[]){
		String str ="RAM IS A GOOD STUDENT";
		String newStr1=Maximum(str);
		String newStr2=Minimum(str);
		System.out.println("Maximum Value Is : "+newStr1);
		System.out.println("Minimum VAlue Is : "+newStr2);
		
		
		
		
	}
}