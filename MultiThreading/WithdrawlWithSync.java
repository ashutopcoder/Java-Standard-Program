//Amount Withdrawl Program With Using Synchronization

class SBI{
	private int balance=10000;
		synchronized public void withdrawl(int amt){
			if(balance>=amt){
				System.out.println("Amount Withdrawl : "+amt);
				balance=balance-amt;
				System.out.println("Balance Left : "+balance);
			}
			else{
				System.out.println("Insufficient Balance.");
			}
		}
}
class Thread1 implements Runnable{
	private SBI obj;
	private int amt;
	Thread1(SBI obj,int amt){
		this.obj=obj;
		this.amt=amt;
	}
	public void run(){
		obj.withdrawl(amt);
	}
}
class WithdrawlWithSync{
	public static void main(String args[]){
		SBI obj=new SBI();
		Thread1 th1=new Thread1(obj,7000);
		Thread1 th2=new Thread1(obj,9000);
		Thread t1=new Thread(th1);
		Thread t2=new Thread(th2);
		t1.start();
		t2.start();
	}
}
