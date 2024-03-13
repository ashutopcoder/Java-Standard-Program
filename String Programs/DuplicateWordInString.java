//Duplicate Word In String : 
public class DuplicateWordInString{
	public static void main(String args[]){
	String str ="RAM IS A GOOD BOY AND RAM IS VERY SMART";
		String[] sr=str.split(" ");
		for(int i=0;i<sr.length;i++){
			for(int j=i+1;j<sr.length;j++){
				if(sr[i].equals(sr[j]))
					System.out.println(sr[j]);
			}
		}
	}
}