// Collection Framework
import java.util.LinkedList;
class Demo{
	public static void main(String[] args){
		LinkedList<Integer> ls = new LinkedList<Integer>();
		LinkedList<Integer> ls2 = new LinkedList<Integer>();
		ls2.add(210);
		ls2.add(220);
		ls2.add(230);
		ls2.add(240);
		ls2.add(250);
		ls2.add(260);
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(50);
		ls.add(60);
		ls.add(70);
		ls.add(80);
		ls.add(90);
		ls.add(100);
		ls.add(110);
		ls.add(120);
		ls.add(130);
		ls.add(140);
		ls.add(150);
		ls.add(160);
		ls.add(170);
		ls.add(180);
		System.out.println(ls);
		ls.remove(1);
		ls.remove(5);
		ls.remove(9);
		System.out.println(ls);
		ls.addAll(ls2);
		System.out.println(ls);
		ls.retainAll(ls2);
		System.out.println(ls);
		System.out.println(ls.get(3));
		System.out.println(ls.contains(230));
		System.out.println(ls.containsAll(ls2));
	}
}