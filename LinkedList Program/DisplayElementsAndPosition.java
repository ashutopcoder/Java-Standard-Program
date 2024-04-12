//To display elements and their positions in a linked list.
import java.util.LinkedList;
public class DisplayElementsAndPosition{
	public static void main(String args[]){
		LinkedList<Integer> list =new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		int num=1;
		for(int i=0;i<list.size();i++){
			System.out.println(num+"st Element Is : "+list.get(i));
			num++;
		}
	}
}