//Search Key Value :
import java.util.Hashtable;
import java.util.Scanner;
public class SearchKeyValue{
	public static void main(String args[]){
		Hashtable<Integer,String> hst=new Hashtable<>();
		hst.put(1,"Mohan");
		hst.put(2,"Sohan");
		hst.put(3,"Ramu");
		hst.put(4,"Vijay");
		hst.put(5,"Dinesh");
		System.out.println("\nKey Value : "+hst);
		System.out.println("\nEnter A key Which You Want To Search  : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(hst.containsKey(num))
			System.out.println("\nPresent");
		else
			System.out.println("\nNot Present");
	}
} 