package Daemon_Thread;
class Red
{
	public void red() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("!!!   Stop Red Signal");
	}
}
class Yellow extends Red
{
public void yellow() {
	try {
		Thread.sleep(1000);
	} catch (Exception e) {
		// TODO: handle exception
	}
	System.out.println("!!! Ready TO Go Yellow Signal...........");
}
	}

class Green extends  Yellow 
{
public void run() {
	try {
		Thread.sleep(500);
	} catch (Exception e) {
		// TODO: handle exception
	}
	
		System.out.println("Go Its Green Signal:::::-");
	}
}
public class Signal_project_Using_Join extends  Green implements Runnable{

	
	
	public static void main(String[] args) throws InterruptedException {
		Signal_project_Using_Join ss=new Signal_project_Using_Join();
		ss. red();
		ss. yellow();
		ss.run();
		
		Thread  ss1=new Thread ();
		Thread  ss2=new Thread ();
		Thread  ss3=new Thread ();
		ss1.start();
		ss1.join();
		ss2.start();
		ss2.join();
		ss3.start();
		
	}

	
	
	

}
