//Subsets Of Strings
class SubsetsString{
	public static void main(String[] args){
		String str = "ABC";
		System.out.println("Your String : "+str);
		for(int i=0;i<str.length();i++){
			int m=0;
			for(int j=0;j<str.length();j++){
				for(m=j;m<=(i+j);m++)
					if(m<str.length())
						System.out.print(str.charAt(m));
					System.out.println();
					if(m==str.length())
						break;
			}
		}
	}
}
