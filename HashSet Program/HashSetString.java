//Write a Java program to Create a HashSet with string items
import java.util.HashSet;
public class HashSetString{
	public static void main(String args[]){
		HashSet<String> hs=new HashSet<>();
		hs.add("Mohan");
		hs.add("Sohan");
		hs.add("Rahul");
		hs.add("Mukesh");
		hs.add("Shiva");
		hs.add("Akshay");
		System.out.println("String Elements : "+hs);
	}
}