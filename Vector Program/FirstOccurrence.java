/*To get the Index of the first occurrence of the specified item in Vector collection
*/
import java.util.Vector;
import java.util.Scanner;
public class FirstOccurrence{
	public static void main(String args[]){
		Vector<Integer> list =new Vector<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(60);
		list.add(70);
		list.add(60);
		list.add(90);
		list.add(100);
		System.out.println("Elements : "+list);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ELement Which You Find Index First Occurence : ");
		int num =sc.nextInt();
		boolean ans=list.contains(num);
		int index=-1;
		if(ans){
			for(int i=0;i<list.size();i++){
				if(list.get(i)==num){
				index=i;
				break;
				}
			}
		}		
		else{
		System.out.println("Element Not Found .");
		}
		if(ans==true)
		System.out.println("First Occuring Position : "+index);
		
	}
}
