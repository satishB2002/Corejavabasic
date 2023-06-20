package Thread;

 class Abc extends Thread
{
	public void run()
	{
		System.out.println("Mulitiple Task Using Thread");
		
		System.out.println("Run NotePad");
	}
	
}
 class Xyz extends Thread
 {
	 public void run()
	 {
		 for (int i = 0; i <5; i++) {
			System.out.println(i);
		}
	 }
	 
 }
public class Single_Thread_Multiple_tsk extends Thread 
	{
		public void run()
			{
			super.run();
			for (int i = 0; i <5; i++) {
			System.out.println(i);
			}
	
    }
	
		public static void main(String[] args) {
			Single_Thread_Multiple_tsk ss=new Single_Thread_Multiple_tsk ();
			ss.start();
			Abc  ss1=new Abc ();
			ss1.start();
			Xyz sd=new Xyz();
			sd.start();
		}
}


