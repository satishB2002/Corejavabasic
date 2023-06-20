package Daemon_Thread;
class Medical
{
	public void medical() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("MEDICAL Process Going On.......");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("MEDICAL Process DONE ,now you can go for test driving ");
	}
	
}
class Driving extends Medical
{
public void driving() {
	try {
		Thread.sleep(1000);
	} catch (Exception e) {
		// TODO: handle exception
	}
	System.out.println("TEST Driving Going on..........");
	try {
		Thread.sleep(1000);
	} catch (Exception e) {
		// TODO: handle exception
	}
	System.out.println("Test Driving completed now you can go for final document Submission ");
}
	}

class Documents extends Driving
{
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("All Documents verifying please wait..........");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Documents are verifying successfully,You ll get the confirmation on mail. ");
		
	}
	}

public class Driving_Test extends Documents implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		Driving_Test  ss=new Driving_Test ();
		ss.medical();
		ss.driving();
		ss.run();
		Thread ss1=new Thread();
		Thread ss2=new Thread();
		Thread ss3=new Thread();
		ss1.start();
		ss1.join();
		ss2.start();
		ss2.join();
		ss3.start();
	}
	

}
