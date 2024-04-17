//Copy One HashTable to Another
import java.util.Hashtable;
public class CopyOneHashtableToAnother{
	public static void main(String args[]){
		Hashtable<Integer,String> hs=new Hashtable<>();
		hs.put(1,"English");
		hs.put(2,"Hindi");
		hs.put(3,"Computer");
		hs.put(4,"Maths");
		System.out.println("First Hashtable : "+hs );
		Hashtable<Integer,String> hs2=new Hashtable<>();
		hs2.put(5,"Mukesh");
		hs2.put(6,"Abhishek");
		hs2.put(7,"Shiva");
		hs2.put(8,"Rakesh");
		System.out.println("Second Hashtable : "+hs2 );
		hs.putAll(hs2);
		System.out.println("After Adding Hashtable : "+hs );
		
		
		
	}
}