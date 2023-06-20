package Thread;

import java.util.Iterator;

public class intrupt_Example extends Thread {
	
		public void run() {
			System.out.println(Thread.currentThread().isInterrupted());
			System.out.println(Thread.currentThread().interrupted());
			
		for (int i = 1; i <=5; i++) {
			try {
				Thread.sleep(500);
				System.out.println(i);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
			
			
		}
	public static void main(String[] args) {
		intrupt_Example ss=new intrupt_Example();
		ss.start();
		ss.interrupt();
	}

}
