//Print all the elements of an ArrayList using the elements' position.
import java.util.ArrayList;
public class PrintElementsAndPosition{
	public static void main(String args[]){
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		al.add(100);
		int pos=1;
		for(int i=0;i<al.size();i++){
			System.out.println(pos+" Element is "+al.get(i));
			pos++;
		}
		
	}
}