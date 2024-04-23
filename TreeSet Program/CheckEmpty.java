//Write a Java program to Check whether a TreeSet is empty or not

import java.util.TreeSet;
public class CheckEmpty{
	public static void main(String args[]){
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(10);
		ts.add(100);
		ts.add(120);
		ts.add(90);
		ts.add(80);
		ts.add(170);
		ts.add(210);
		ts.add(310);
		ts.add(910);
		ts.add(510);
		System.out.println("Entered Elements : "+ts);
		boolean ans=ts.isEmpty();
		if(ans)
			System.out.println("TreeSet Is Empty .");
		else
			System.out.println("TreeSet Is Not Empty .");
		
	}
}