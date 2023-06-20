package Thread;

public class Is_Alive_Or_Not extends Thread{
		@Override
			public void run() {
			
			System.out.println("Run Method");
				System.out.println("Thred In Method="+Thread.currentThread().isAlive());
				
			}
public static void main(String[] args) {
	Is_Alive_Or_Not ss=new Is_Alive_Or_Not();
	Is_Alive_Or_Not ss1=new Is_Alive_Or_Not();
	ss.start();
	ss1.start();
	
	ss.stop();// This Method are Deleted form Thread
	//ss.destroy();// This Method are Deleted form Thread
	
	
    System.out.println("Thred Mathod In Main="+ss.isAlive());
    System.out.println(ss1.isAlive());
	System.out.println("Thred In Main Mathod ="+Thread.currentThread().isAlive());
}

}
