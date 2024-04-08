//Search for an element in an array list.
import java.util.Scanner;
import java.util.ArrayList;
public class SearchElement{
	public static void main(String args[]){
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(30);
		System.out.println("Entered ArrayList : ");
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Elemnt Which You Want To Search : ");
		int num=sc.nextInt();
		for(int i=0;i<al.size();i++){
		if(al.contains(num)){
			System.out.println("Element Found .");
			break;
		}
		else{
		System.out.println("Element Not Found");
		break;
		}
		}		
	}
}
