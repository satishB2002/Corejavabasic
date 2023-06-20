package Thread;

public class Example_Wait_MNotify extends Thread{
	
	int total_sum=0;
	
		public void run() {
			synchronized(this)
		{
			for (int i = 1; i <=100; i++) {
				total_sum =total_sum+100;
			
		}
			this.notify();
		}
		}
		
	public static void main(String[] args) throws InterruptedException {
		Example_Wait_MNotify ss=new Example_Wait_MNotify();
		ss.start();
		synchronized(ss)
		{
			ss.wait();
			System.out.println("Total Amount="+ss.total_sum);
		}
	}

	

}
