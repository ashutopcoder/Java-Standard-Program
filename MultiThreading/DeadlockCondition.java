//DeadLock Condition 

class Test{
	synchronized public void test1(Test obj){
		System.out.println(Thread.currentThread().getName()+" Using test1");
		obj.test2();
		System.out.println(Thread.currentThread().getName()+" Using test1");
	}
	synchronized public void test2(){
		System.out.println(Thread.currentThread().getName()+" Using test2");
	}
}
class Thread1 extends Thread{
	private Test obj;
	private Test obj1;
	Thread1(Test obj,Test obj1){
		this.obj=obj;
		this.obj1=obj1;
	}
	public void run(){
		obj.test1(obj1);
	}
}
class Thread2 extends Thread{
	private Test obj;
	private Test obj1;
	Thread2(Test obj,Test obj1){
		this.obj=obj;
		this.obj1=obj1;
	}
	public void run(){
		obj1.test1(obj);
	}
}
public class DeadlockCondition{
	public static void main(String args[]){
		Test obj=new Test();
		Test obj1=new Test();
		Thread1 t1=new Thread1(obj,obj1);
		Thread2 t2=new Thread2(obj,obj1);
		t1.setName("Thread1");
		t2.setName("Thread2");
		t1.start();
		t2.start();
	}
}