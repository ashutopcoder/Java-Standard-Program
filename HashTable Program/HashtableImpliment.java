//Implement HashTable
import java.util.Hashtable;
public class HashtableImpliment{
	public static void main(String args[]){
		Hashtable<Integer,String> hs=new Hashtable<>();
		hs.put(1,"Aman");
		hs.put(2,"Ramu");
		hs.put(3,"Ashu");
		hs.put(4,"Dimpal");
		hs.put(5,"Kavendra");
		System.out.println("\nHashTable Element : "+hs);
		System.out.println("\nKey 1 Value : "+hs.get(1));
		hs.remove(2);
		System.out.println("\n New jHashTable Element : "+hs);	
	}
}