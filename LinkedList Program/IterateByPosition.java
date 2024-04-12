/*iterate through all elements in a linked list starting at 
the specified position.*/
import java.util.LinkedList;
import java.util.Scanner;
public class IterateByPosition{
	public static void main(String args[]){
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		ll.add(70);
		ll.add(80);
		ll.add(90);
		ll.add(100);
		System.out.println("Entered LinkedList : ");
		for(int i=0;i<ll.size();i++){
			System.out.println(ll.get(i));
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Stating Position : ");
		int start=sc.nextInt();
		System.out.println("Enter Ending Position : ");
		int end=sc.nextInt();
		System.out.println("You New Array Is here : ");
		for(int i=start-1;i<end;i++){
			System.out.println(ll.get(i));
		}
	}
}