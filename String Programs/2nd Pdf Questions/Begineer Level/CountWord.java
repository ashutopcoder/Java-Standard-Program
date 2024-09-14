//8. Write a program to count the number of words in a string. 

class CountWord{
	public static void main(String args[]){
		String str="Ram Is A Good Boy.";
		String[] arr = str.split(" ");
		System.out.println("Number Of Words In String "+arr.length);
	}
}