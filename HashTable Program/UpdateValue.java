//Update A value of a key
import java.util.Hashtable;
public class UpdateValue{
	public static void main(String args[]){
		Hashtable<Integer,String> hst=new Hashtable<>();
		hst.put(1,"Ramu");
		hst.put(2,"Mohan");
		hst.put(3,"Sohan");
		hst.put(4,"Mohan Kumar");
		hst.put(5,"Mohit");
		System.out.println("Entered Value : "+hst);
		hst.put(1,"Mukesh");
		System.out.println("Updated Value : "+hst);
		
	}
}
