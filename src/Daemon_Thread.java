
public class Daemon_Thread  extends Thread {
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon Thread");
		}
		else 
			{
				System.out.println("Another Thread");
			}
		
	}
public static void main(String[] args) {
	Daemon_Thread ss=new Daemon_Thread();
	Daemon_Thread ss1=new Daemon_Thread();
	Daemon_Thread ss2=new Daemon_Thread();
	ss.setDaemon(true);
	ss.start();
	ss1.start();
	ss2.start();
}
}
