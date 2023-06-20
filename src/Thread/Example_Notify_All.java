package Thread;

public class Example_Notify_All extends Thread{
	int i,j,sum=0;
	
	public void run() {
		synchronized(this)
		{
			for(i=1;i<=10;i++)
			{
				
				for(j=1;j<=4;j++)
				{
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					System.out.print(i*j+"  ");
				}
				System.out.println();
			}
		}
			this.notifyAll();
			
		}
	
public static void main(String[] args) throws InterruptedException {
	Example_Notify_All  ss=new Example_Notify_All ();
	ss.start();
	synchronized(ss)
	{
		ss.wait();
		System.out.println(" Second Thread");
	}
	
	Example_Notify_All  ss1=new Example_Notify_All ();
	ss1.start();
	synchronized(ss1)
	{
		//ss1.wait();
		System.out.println(" Third Thread");
	}
	
	
	Example_Notify_All  ss2=new Example_Notify_All ();
	ss2.start();
	synchronized(ss2)
	{
		//ss2.wait();
		System.out.println(ss2.sum);
	}
	
	
}
}
