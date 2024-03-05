//User Enter Array
import java.util.Scanner;
public class UserDefineArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Range : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter "+size+" Elements : ");
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		System.out.print("Your ArrayIs Here : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
			
	}
}

