package Daemon_Thread;

public class Create_Daemon_Thread extends Thread {

	public void run() {
		
		System.out.println("Daemon Thread Strated");
		System.out.println(Thread.currentThread().isDaemon());
		//Thread.currentThread().setDaemon(true);
		System.out.println(Thread.currentThread().getName());
		
	}
public static void main(String[] args) {
	Create_Daemon_Thread ss=new Create_Daemon_Thread();
	ss.setDaemon(true);
	ss.start();
}
}
