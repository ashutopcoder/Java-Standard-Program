//Write a Java program to compare two Stack collections
import java.util.Stack;
public class CompareStack{
	public static void main(String args[]){
		Stack<Integer> list =new Stack<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("\nFirst Stack Elements : "+list);
		Stack<Integer> list2 =new Stack<>();
		list2.add(1);
		list2.add(20);
		list2.add(3);
		list2.add(40);
		list2.add(50);
		System.out.println("\nSecond Stack Elements : "+list2);
		System.out.println("\nFirst List Size : "+list.size());
		System.out.println("\nSecond List Size : "+list2.size());
		int count=0;
		for(int i=0;i<list.size();i++){
			for(int j=0;j<list2.size();j++){
				if(list.get(i)==list2.get(j)){
					count++;
				}
			}
		}
		System.out.println("\nElements matched : "+count);
	}
}