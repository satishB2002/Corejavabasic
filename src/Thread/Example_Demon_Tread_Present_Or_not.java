package Thread;

public class Example_Demon_Tread_Present_Or_not extends Thread {

	
	public void run() {
		System.out.println("Run Method");
		System.out.println("Thread is Alive="+Thread.currentThread().isAlive());
		
	}
	public static void main(String[] args) {
		Example_Demon_Tread_Present_Or_not ss=new Example_Demon_Tread_Present_Or_not();
		ss.setDaemon(true);
		ss.start();
		System.out.println("Main is Alive="+Thread.currentThread().isAlive());
		
		
		
	}
	

}
