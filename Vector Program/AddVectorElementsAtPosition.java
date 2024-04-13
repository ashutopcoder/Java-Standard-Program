/*To add elements of a vector to other vector collection at the specified position
*/
import java.util.Vector;
import java.util.Scanner;
public class AddVectorElementsAtPosition{
	public static void main(String args[]){
		Vector<Integer> list =new Vector<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		System.out.println("List 1 : "+list);
		Vector<Integer> list2 =new Vector<>();
		list2.add(100);
		list2.add(200);
		list2.add(300);
		list2.add(400);
		list2.add(500);
		list2.add(600);
		list2.add(700);
		System.out.println("List2 2 : "+list);
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Position Where You Want To Add : ");
		int num=sc.nextInt();
		list.addAll(num-1,list2);
		System.out.println("New List : "+list);
	}
}