//To get element from Vector collection at the specified index
import java.util.Vector;
import java.util.Scanner;
public class GetElementSpecificIndex{
	public static void main(String args[]){
		Vector<Integer> list=new Vector<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println("Elements : "+list);
		Scanner sc=new Scanner(System.in);
		System.out.println("Which Index Value You Want To Print : ");
		int num =sc.nextInt();
		int ans=list.get(num-1);
		System.out.println("Your element Is Here : "+ans);
	}
}