//13. Write a program to remove duplicate characters from a string. 

class RemoveDuplicate{
	public static void main(String args[]){
		String str="MADAM";
		System.out.println("Entered String : "+str);
		StringBuffer sb=new StringBuffer(str);
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i)!='$'){
				for(int j=i+1;j<sb.length();j++){
					if(sb.charAt(i)==sb.charAt(j)){
						sb.setCharAt(j,'$');
					}
				}
			}
		}
		System.out.println("\nAfter Removing Duplicate : ");
		for(int m=0;m<sb.length();m++){
				if(sb.charAt(m)!='$')
					System.out.print(sb.charAt(m));
		}	
	}
}