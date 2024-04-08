//Update an array element by the given element.
import java.util.Scanner;
import java.util.ArrayList;
public class UpdateArrayListElement{
	public static void main(String args){
		ArrayList<Integer> al =new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println("ArrayList Elements : ");
			for(int i=0;i<al.size();i++){
				System.out.println(al.get(i));
			}
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A Element Which You Add : ");
		int Element=sc.nexInt();
		System.out.println("Enter A Index Where You Want To Add Element  : ");
		int index=sc.nexInt();
			al.add(index,Element);
		System.out.println(" New ArrayList Elements : ");		
			for(int i=0;i<al.size();i++){
				System.out.println(al.get(i));
			}
		
	}
}