//Write a Java program to extract a portion of an array list.
import java.util.Scanner;
import java.util.ArrayList;
public class PrintArrayListPortion{
	public static void main(String args[]){
		ArrayList<String> al=new ArrayList<>();
		al.add("Rajan");
		al.add("Mohan");
		al.add("Sohan");
		al.add("Shiva");
		al.add("Rohit");
		al.add("Bablu");
		al.add("Mohit");
		System.out.println("Entered Elements : ");
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starating Position : ");
		int start=sc.nextInt();
		System.out.println("Enter Ending Position : ");
		int end =sc.nextInt();
		for(int i=start-1;i<end;i++){
			System.out.println(al.get(i));
		}
	}
}