//Insert the specified element at the specified position in linked list.
import java.util.LinkedList;
import java.util.Scanner;
public class InsertElementAtSpecificPosition{
	public static void main(String args[]){
		LinkedList<Integer> list=new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		System.out.println("Entered LinkedList : "+list+" ");
		System.out.println("Enter Which Position You Want To Add Element : ");
		Scanner sc=new Scanner(System.in);
		int pos=sc.nextInt();
		System.out.println("Enter Element : ");
		int num=sc.nextInt();
		list.add(pos-1,num);
		System.out.println("After Insert Element In LinkedList : "+list+" ");
		
	}
}