//Write a Java program to create a vector to store objects of a class
import java.util.Vector;
public class StoreObjects{
	public static void main(String args[]){
		Vector<Emp> vl=new Vector<>();
		Emp emp1 = new Emp(101,"Rahul");
		Emp emp2 = new Emp(102,"Ramu");
		Emp emp3 = new Emp(103,"Raju");
		Emp emp4 = new Emp(104,"Raman");
		vl.add(emp1);
		vl.add(emp2);
		vl.add(emp3);
		vl.add(emp4);
		for(Emp emp : vl)
		{
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