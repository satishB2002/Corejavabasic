package Thread;


	public class  Multithreading extends Thread
	{
		
		
		
		    public void run ()
		    {
		        for (int i = 0; i <= 5; i++)
		        {
		            System.out.println ("Run: " + i);
		        }
		    }
		    public static void main (String[]args)
		    {
		    	Multithreading mt = new Multithreading();
		        mt.start ();
		        mt.run ();
		        for (int i = 0; i <= 5; i++)
		        {
		            System.out.println ("Main: " + i);
		        }
		    }
		}

