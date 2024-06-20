//Keyword Synchronization 

class KeywordSync{
	private static String s1="Hello";
	private static String s2="India";
	public static void main(String args[]){
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		t1.setName("Thread1");
		t2.setName("Thread2");
		t1.start();
		t2.start();
	}
	static class Thread1 extends Thread{
		public void run(){
				synchronized(s1){
				System.out.println(Thread.currentThread().getName()+"Using s1");
					synchronized(s2){
					System.out.println(Thread.currentThread().getName()+"Using s2");
				}
			}
		}
	}
	
	static class Thread2 extends Thread{
		public void run(){
				synchronized(s2){
				System.out.println(Thread.currentThread().getName()+"Using s2");
					synchronized(s1){
					System.out.println(Thread.currentThread().getName()+"Using s1");
				}
			}
		}
	}
}