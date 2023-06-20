package Thread;

public class Example_Alive_Or_Not extends Thread  {

		public void run() {
			System.out.println("Run Method Is Alive="+Thread.currentThread().isAlive());
		}
	
public static void main(String[] args) {
	Example_Alive_Or_Not ss=new Example_Alive_Or_Not();
	ss.start();
	System.out.println("Main Method Is Alive="+ss.isAlive());
	
}
}
