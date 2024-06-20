//Daemon Thread
//Daemon Thread is Service Provider For All Other User Thread
//Daemon Thread Terminate When All User Threads Dies.


class Thread1 extends Thread{
	private int range;
	Thread1(int range){
		this.range=range;
	}
	public void run(){
		for(int i=1;i<=range;i++){
			System.out.println(i);
			try{Thread.sleep(1000);}catch(Exception e){}
		}
	}
}
class DaemonThread{
	public static void main(String args[]){
		Thread1 t1=new Thread1(10);
		Thread1 t2=new Thread1(6);
		Thread1 t3=new Thread1(20);
		t3.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}
}