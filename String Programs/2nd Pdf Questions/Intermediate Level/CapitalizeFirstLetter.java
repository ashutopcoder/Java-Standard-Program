//19.Program to capitalize the first letter of each word in a string. 

class CapitalizeFirstLetter{
	public static void main(String args[]){
		String str="my name is abhishek chauhan";
		String str2="";
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++){
			str2+=(char)(int)((arr[i].charAt(0))-32)+arr[i].substring(1)+" ";
		}
		System.out.println("After Capitalised : "+str2);
	}
}