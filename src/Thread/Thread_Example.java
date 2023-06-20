package Thread;

public class Thread_Example extends Thread{
	
	public void run() {
		System.out.println("Single Task Using Muliple Thread");
		for (int i = 1; i <=5; i++) {
			System.out.println(i);
		}
		for (int i =50; i <=67; i++) {
		System.out.println((char)i);	
		}
		
	}
public static void main(String[] args) {
	Thread_Example ss=new Thread_Example();
	ss.start();
	Thread_Example ss1=new Thread_Example();
	
	ss1.start();
	
}
}
