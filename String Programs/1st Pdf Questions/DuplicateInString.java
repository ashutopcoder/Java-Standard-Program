//Duplicate Character In String :
public class DuplicateInString{
	public static void main(String args[]){
		String str = "ABCABDFGHYTG";
		StringBuffer sb=new StringBuffer(str);
		for(int i=0;i<str.length()-1;i++){
			int count=0;
			if(str.charAt(i)!='$'){
				for(int j=i+1;j<str.length();j++){
					if(sb.charAt(i)==sb.charAt(j)){
						count++;
						sb.setCharAt(j,'$');
					}
				}
				if((count>0)&&(sb.charAt(i)!='$')){
					System.out.print("\n Repeating Characters InString : "+sb.charAt(i)+" ");
					
				}
			}
		}
	}
}