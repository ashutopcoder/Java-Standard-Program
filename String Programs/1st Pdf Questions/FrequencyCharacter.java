//Frequency Of Characters :
public class FrequencyCharacter{
	public static void main(String args[]){
		String str="ABCDEABCASFGHTYA";
		StringBuffer sb=new StringBuffer(str);
		for(int i=0;i<str.length();i++){
		int count=1;
		if(sb.charAt(i)!='$'){
			for(int j=i+1;j<str.length();j++){
				if(sb.charAt(i)==sb.charAt(j)){
					count++;
					sb.setCharAt(j,'$');
				}
			}
			if(sb.charAt(i)!='$')
			System.out.println(sb.charAt(i)+" = "+count);
		}
	}
 }
}