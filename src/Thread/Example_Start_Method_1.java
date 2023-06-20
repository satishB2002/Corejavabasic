package Thread;

public class Example_Start_Method_1 extends Thread{

	public void run() {
	System.out.println("Run Method Called");
		
	}
public static void main(String[] args) {
	Example_Start_Method_1  ss=new Example_Start_Method_1 ();
	ss.start();
}
}
