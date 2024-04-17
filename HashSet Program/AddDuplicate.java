//Write a Java program to Adding duplicate elements to HashSet

import java.util.HashSet;
public class AddDuplicate{
	public static void main(String args[]){
		HashSet<Integer> hs=new HashSet<>();
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(400);
		hs.add(700);
		hs.add(500);
		hs.add(600);
		hs.add(700);
		hs.add(100);
		System.out.println("Entered Elements : "+hs);		
	}
}