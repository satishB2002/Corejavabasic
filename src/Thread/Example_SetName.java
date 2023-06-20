package Thread;

public class Example_SetName extends Thread{
	
		public void run() {
			
			System.out.println(Thread.currentThread().getName());
		}
	public static void main(String[] args) {
		Example_SetName ss=new Example_SetName();
		ss.start();
		System.out.println(Thread.currentThread().getName());
		ss.setName("Satish");
		
	}

}
