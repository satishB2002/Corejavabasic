package Thread;

public class Example_Priority extends Thread{
	
		public void run() {
			Thread.currentThread().setPriority(5);
			System.out.println("Run Method Priority="+Thread.currentThread().getPriority());
			System.out.println("Run Method Name="+Thread.currentThread().getName());
		}
	public static void main(String[] args) {
		Example_Priority  ss=new Example_Priority ();
		ss.start();
		Thread.currentThread().setPriority(10);
		System.out.println("Main Method Priority="+Thread.currentThread().getPriority());
		ss.setName("Satish");
		System.out.println("Main Method Name="+Thread.currentThread().getName());
	}

}
