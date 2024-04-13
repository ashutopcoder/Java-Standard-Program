//Write a Java program to count the items of a Vector collection
import java.util.Vector;
public class CountVectorItems{
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
		int count=0;
		for(int i=0;i<list.size();i++){
			count++;
		}
		System.out.println("Total Elements : "+count);
	}
}