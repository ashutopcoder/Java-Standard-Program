//PRODUCER AND CONSUMER (CREATING 4 AND CONSUME AFTER PRODUCE)
import java.util.*;
public class ProducerConsumer{
	private static final int end=4;
	private static final Queue<Integer> buffer=new LinkedList<>();
	
	static class Producer implements Runnable{
		public void run(){
			int x=1;
			while(true){
			synchronized(buffer){
				while(buffer.size()==end){
				try{buffer.wait();}catch(Exception e){}}
				System.out.println("Produced Product : "+x);
				buffer.add(x);
				x++;
				buffer.notify();
				try{Thread.sleep(1000);}catch(Exception e){}
			}
			}
		}
	}
	static class Consumer implements Runnable{
		public void run(){
			while(true){
			synchronized(buffer){
				while(buffer.isEmpty()){
					try{buffer.wait();}catch(Exception e){}
				}
				int out=buffer.poll();
				System.out.println("Consumed Product : "+out);
				buffer.notify();
				try{Thread.sleep(1000);}catch(Exception e){}
			}
			}
		}
	}
	public static void main(String args[]){
		Thread pt=new Thread(new Producer());
		Thread ct=new Thread(new Consumer());
		pt.start();
		ct.start();
	}
}