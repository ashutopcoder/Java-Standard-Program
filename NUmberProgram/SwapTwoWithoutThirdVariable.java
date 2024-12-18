//SWAP TWO NUMBERS WITHOUT USING THIRD VARIABLE

class SwapTwoWithoutThirdVariable{
	public static void main(String args[]){
		int num1=100;
		int num2=200;
		System.out.println("BEFORE REVERSING : ");
		System.out.println("First Number : "+num1);
		System.out.println("Second Number : "+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("AFTER REVERSING : ");
		System.out.println("First Number : "+num1);
		System.out.println("Second Number : "+num2);
		
	}
}