//Insert some elements at the specified position into a linked list.
import java.util.LinkedList;
import java.util.Scanner;
public class InsertSomeElementAtSpecificPositions{
	public static void main(String args[]){
		LinkedList<Integer> list =new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		System.out.println("Entered LinkedList : "+list);
		char ch='y';
		while((ch=='Y')||(ch=='y')){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Position : ");
		int pos=sc.nextInt();
		System.out.println("Enter Element : ");
		int num=sc.nextInt();
		list.add(pos-1,num);
		System.out.println("Updated list : "+list);
		System.out.println("Enter Your Choice\nYou Want To Add More : Y/N");
		ch=sc.next().charAt(0);
		}
	}
}