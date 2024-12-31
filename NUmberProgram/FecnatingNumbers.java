import java.util.Scanner;
// 48-57(AsCii value 1to9:
//A-Z _->65-90
//a-z -> 97-122
public class FecnatingNumbers {
	public static boolean Facinating(int num) {
		String str = ""+num*1+num*2+num*3;
		System.out.println(str);
		int count = 0;
		for(int j=49;j<=57;j++){
			for(int i=0;i<str.length();i++){
				if(j==(int)str.charAt(i)) {
					count++;
					break;
				}
			}
		}
		if(count==9)
			return true;
		return false;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		boolean result = FecnatingNumbers.Facinating(num);
		if(result)
			System.out.println("Facinating Number");
		else
			System.out.println("Not Facinating Number");
	}
}
