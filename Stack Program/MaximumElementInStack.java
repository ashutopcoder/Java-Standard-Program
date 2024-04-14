//Write a Java program to Find Maximum Element in a Stack
import java.util.Stack;
public class MaximumElementInStack{
	public static void main(String args[]){
		Stack<Integer> list=new Stack<>();
		list.push(10);
		list.push(100);
		list.push(110);
		list.push(1000);
		list.push(120);
		list.push(150);
		System.out.println("Entered Stack Elements : "+list);
		int max=list.pop();
		while(list.size()>0){
			int value=list.pop();
			if(max<value){
				int temp=max;
				max=value;
				value=temp;
			}
		}
		System.out.println("Maximum Value In Stack : "+max);
	}
}