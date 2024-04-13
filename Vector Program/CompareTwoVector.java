//Write a Java program to compare two Vector collections
import java.util.Vector;
public class CompareTwoVector{
	public static void main(String args[]){
		Vector<Integer> list =new Vector<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println("\nFirst List : "+list);
		Vector<Integer> list1 =new Vector<>();
		list1.add(1);
		list1.add(20);
		list1.add(3);
		list1.add(40);
		list1.add(5);
		list1.add(6);
		System.out.println("\nSecond List : "+list1);
		System.out.println("\nSize Of First List : "+list.size());
		System.out.println("\nSize Of Second List : "+list1.size());
		int count=0;
		for(int i=0;i<list.size();i++){
			for(int j=0;j<list1.size();j++){
				if(list.get(i)==list1.get(j)){
				count++;
				}
			}
		}
		System.out.println("\nMatched Elements : "+count);
	}
}