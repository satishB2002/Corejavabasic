package Daemon_Thread;
class x_Parre
{
	public void result() {
		System.out.println("Method result");
	}
}
class Old_parr extends x_Parre
{
public void output() {
	System.out.println("Method output");
	}
}
class Parrent extends  Old_parr
{
public void PQR3() {
	System.out.println("Method PQR3");
	}
}
public class Multiple_Thread extends Parrent implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Rumnnable Method");
	}
	public static void main(String[] args) {
		 Multiple_Thread ss=new  Multiple_Thread();
		 ss.PQR3();
		 ss.result
		 ();
		 ss.output();
		 Thread ss1=new Thread (ss);
		 
		 ss.PQR3();
		 ss1.start();
		 ss1.yield();
		 Thread ss2=new Thread (ss);
		 ss2.start();
		// ss1.yield();
		 Thread ss3=new Thread (ss);
		 ss3.start();
		
	}
	

}
