//Write a Java program to create a Stack collection of objects of a class
import java.util.Stack;
public class ObjectOfClass{
	public static void main(String args[]){
		Stack<Emp> st=new Stack<>();
		Emp emp1 = new Emp(101,"Rahul");
		Emp emp2 = new Emp(102,"Amit");
		Emp emp3 = new Emp(103,"Mukesh");
		st.push(emp1);
		st.push(emp2);
		st.push(emp3);
		for(Emp emp : st){
			System.out.println("ID : "+emp.id);
			System.out.println("Name : "+emp.name);
		}
	}
}
class Emp{
	int id;
	String name;
	Emp(int id,String name){
		this.id=id;
		this.name=name;
	}
}