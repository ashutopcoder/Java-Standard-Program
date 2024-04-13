/*Write a Java program to remove an item from Vector collection at the specified index
*/
import java.util.Vector;
import java.util.Scanner;
public class RemoveSpecificIndexItem{
	public static void main(String args[]){
		Vector<Integer> list=new Vector<>();
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
		System.out.println("Entered Elements : "+list);
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter Position Of Element Which You Want To Remove : ");
		int num=sc.nextInt();
		list.remove(num-1);
		System.out.println("\nUpdated Elements : "+list);
		
		
	}
	
}