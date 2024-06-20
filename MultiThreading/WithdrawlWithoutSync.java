//Amount Withdrawl Program Without Using Synchronization (Major Cause)

class SBI{
	private int balance=10000;
		public void withdrawl(int amt){
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
class Thread1 extends Thread{
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
class WithdrawlWithoutSync{
	public static void main(String args[]){
		SBI obj=new SBI();
		Thread1 t1=new Thread1(obj,7000);
		Thread1 t2=new Thread1(obj,9000);
		t1.start();
		t2.start();
	}
}
