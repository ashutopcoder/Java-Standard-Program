//Write a Java program to create a vector to store integer elements
import java.util.Vector;
public class CreateVector{
	public static void main(String args[]){
		Vector<Integer> vl=new Vector<>();
		vl.add(10);
		vl.add(20);
		vl.add(30);
		vl.add(40);
		vl.add(50);
		vl.add(60);
		for(int i=0;i<vl.size();i++){
		System.out.println("Elements : "+vl.get(i));
		}
	}
}