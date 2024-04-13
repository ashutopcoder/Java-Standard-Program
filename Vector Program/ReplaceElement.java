//To replace an item into Vector collection at the specified index
import java.util.Vector;
import java.util.Scanner;
public class ReplaceElement{
	public static void main(String args[]){
		Vector<Integer> list=new Vector<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEntered Elements : "+list);
		System.out.println("\nEnter Position Where You Want To Insert : ");
		int pos=sc.nextInt();
		System.out.println("\nEnter Element Which You Want To Insert : ");
		int element=sc.nextInt();
		list.set(pos-1,element);
		System.out.println("\nElement Entered SuccessFully. : ");
		System.out.println("\nEntered Elements : "+list);
		
	}
}