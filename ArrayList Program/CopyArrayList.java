//Write a Java program to copy one array list into another.
import java.util.ArrayList;
public class CopyArrayList{
	public static void main(String args[]){
		ArrayList<Integer>list1=new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(60);
		System.out.println("Entered ArrayList : ");
		for(int i=0;i<list1.size();i++){
			System.out.println(list1.get(i));
		}
		System.out.println("After Clone ArrayList1 To ArrayList2 : ");
		ArrayList list2=(ArrayList)list1.clone();
		for(int i=0;i<list1.size();i++){
			System.out.println(list2.get(i));
		}
	}
}