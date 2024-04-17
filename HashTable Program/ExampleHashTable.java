//ExampleHashtable : 
import java.util.Hashtable;
import java.util.Enumeration;
public class ExampleHashTable{
	public static void main(String args[]){
		Hashtable<Integer,String> hst=new Hashtable<>();
		hst.put(1,"Ramu");
		hst.put(2,"Sohan");
		hst.put(3,"Rohan");
		hst.put(4,"Mohan");
		System.out.println("Retrive By Direct Meathod : "+hst);
		Enumeration en=hst.keys();
		while(en.hasMoreElements()){
			int num=(int)en.nextElement();
			System.out.println("Key : "+num+"     Value : "+hst.get(num));
		}
	}
}