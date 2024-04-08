//Create Array list And Add Colors Name
import java.util.Scanner;
import java.util.ArrayList;
public class CreateArrayList{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<String>();
		char ch = 'Y';
		while((ch=='y')||(ch=='Y'))
		{
			System.out.print("Enter A Color Name : ");
			String str = sc.next();
			al.add(str);
			System.out.print("Do You Want To Add More (Y/N) : ");
			ch = sc.next().charAt(0);
		}
		System.out.println("\nHere Is Your Strings");
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
	}
}