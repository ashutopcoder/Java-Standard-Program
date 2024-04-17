//Java program to Print a HashSet collection using the foreach loop
import java.util.HashSet;
public class PrintUsingForeach{
	public static void main(String args[]){
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		for(int num:hs){
			System.out.println("Elements : "+num);
		}
	}
}