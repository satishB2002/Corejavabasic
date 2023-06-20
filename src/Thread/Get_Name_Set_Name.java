package Thread;

public class Get_Name_Set_Name extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
public static void main(String[] args) {
	Get_Name_Set_Name ss=new Get_Name_Set_Name();
	ss.start();
	System.out.println(ss.getName());
	ss.setName("Satish");
	System.out.println(ss.getName());
}
}
