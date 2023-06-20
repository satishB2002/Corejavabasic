package Thread;

public class Priority_Schedular extends Thread{
	
		private static final int Default_PRIORITY = 0;
		private static final String Current_PRIORITY = null;

		public void run() {
			System.out.println(Thread.currentThread().getName());
		}
	
public static void main(String[] args) {
	Priority_Schedular ss=new Priority_Schedular();
	Priority_Schedular ss1=new Priority_Schedular();
	Priority_Schedular ss2=new Priority_Schedular();
	Priority_Schedular ss3=new Priority_Schedular();
	
	ss.setPriority(MAX_PRIORITY);
	ss1.setPriority(NORM_PRIORITY);
	ss2.setPriority(MIN_PRIORITY);
	//ss2.setPriority(Default_PRIORITY);
	ss.setName(Current_PRIORITY);
	ss.start();
	ss1.start();
	ss2.start();
	ss3.start();
}
}
