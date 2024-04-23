//Check Element Is Present Or Not : 
import java.util.LinkedHashSet;
import java.util.Scanner;

public class CheckElementIsPresent{
	public static void main(String args[]){
		LinkedHashSet<Integer> item=new LinkedHashSet<>();
		item.add(10);
		item.add(20);
		item.add(30);
		item.add(40);
		item.add(50);
		item.add(60);
		item.add(70);
		System.out.println("Elements "+item);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Element Which You Want To Search : ");
		int num=sc.nextInt();
		boolean ans=item.contains(num);
		if(ans){
			System.out.println("Element Is Present .");
		}
		else
			System.out.println("Element Is Not Present .");
			
		
	}
}
