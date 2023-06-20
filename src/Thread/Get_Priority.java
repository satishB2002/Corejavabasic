//Question 3: Demonstrate gerPriority() and setPriority() methods in Java threads.

package Thread;

public class Get_Priority extends Thread{

public void run() {
	System.out.println(Thread.currentThread().getName());
}
public static void main(String[] args) {
	Get_Priority ss=new Get_Priority();
	ss.start();
	ss.setPriority(10);
	ss.setName("Satish");
	System.out.println(Thread.currentThread().getName());
	
}
}
