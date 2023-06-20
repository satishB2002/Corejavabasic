package Thread;

public class Main_Thread_Priority_name extends Thread{
	
		public void run() {
			System.out.println(Thread.currentThread().getName());
		}
	
public static void main(String[] args) {
	Main_Thread_Priority_name ss=new Main_Thread_Priority_name();
	
	System.out.println("main Name="+Thread.currentThread().getName());
	Thread.currentThread().setName("Satish");
	System.out.println("New Name="+Thread.currentThread().getName());
	Thread.currentThread().getName();
	Thread.currentThread().setPriority(10);
	System.out.println("New Priority="+Thread.currentThread().getPriority());
}
}
