//Write a Java program to compare two array lists.
import java.util.ArrayList;
public class CompareArrayList{
	public static void main(String args[]){
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		ArrayList<Integer> list2=new ArrayList<>();
		list2.add(8);
		list2.add(5);
		list2.add(4);
		list2.add(2);
		list2.add(10);
		list2.add(67);
		list2.add(87);
		list2.add(34);
		System.out.println("1st ArrayList Length : "+list1.size());
		System.out.println("2nd ArrayList Length : "+list2.size());
		int count=0;
		for(int i=0;i<list1.size();i++)
		{
			for(int j=0;j<list2.size();j++)
			{
				if(list1.get(i)==list2.get(j))
				{
					count++;
				}
			}
		}
		System.out.println("Element matched In Both Array List : "+count);
	}
}