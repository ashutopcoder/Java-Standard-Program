//Write a Java program to test a hash set is empty or not
import java.util.HashSet;
public class CheckEmptyOrNot{
	public static void main(String args[]){
		HashSet<String> hs=new HashSet<>();
		hs.add("Ashu");
		hs.add("Mukesh");
		hs.add("Shiva");
		boolean ans=hs.isEmpty();
		if(ans)
			System.out.println("HashSet Is Empty .");
		else
			System.out.println("HashSet Is Not Empty .");
	}
}