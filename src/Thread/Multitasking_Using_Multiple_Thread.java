package Thread;
class First extends Thread{
	public void run() {
		System.out.println("Multiple task and multiple threads ");
		System.out.println("Current Name Of Methods ");
		System.out.println("Thread 1="+Thread.currentThread().getName());
	}
}
class Second extends Thread{
public void run() {
	System.out.println("Thread 2="+Thread.currentThread().getName());
	}

}
public class Multitasking_Using_Multiple_Thread extends Thread{
public void run() {
	System.out.println("Thread 3="+Thread.currentThread().getName());
	}
public static void main(String[] args) {
	 First ss=new  First();
	ss.start();
	ss.setName("Satish");
	System.out.println(ss.getName());
	Second dd=new Second();
	dd.start();
	dd.setName("Barate");
	Multitasking_Using_Multiple_Thread  gg=new Multitasking_Using_Multiple_Thread ();
	gg.start();
	gg.setName("In Pune");
	System.out.println(Thread.currentThread().getName());
}
	
}
