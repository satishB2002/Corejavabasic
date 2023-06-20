package Thread;
class IntrupptedE_xample
{
	int total_seat =40;
	public synchronized void SeatBookingApp(int seat) {
		if(seat<=total_seat)
		{
			System.out.println(Thread.currentThread().getName()+" Congratulations !! Your "+seat+" Seats has been Successfully book in Mahindra travel");
			
		
		total_seat =total_seat-seat;
		System.out.println(" Remaining Seats Are"+total_seat);
	     try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}
	else
	
	{
		System.out.println(" Sorry Seats Are Not Avialable Kindly Check the Seat Again");
		
	}
		System.out.println(total_seat);
}
}

public class Synchronised_Method_Using_Intrrupted extends Thread{
static IntrupptedE_xample st;
	
	int seat;

	
	public void run() {
			
			st.SeatBookingApp(seat);	
	}
	public static void main(String[] args) {
		st =new IntrupptedE_xample ();
		Synchronised_Method_Using_Intrrupted ss=new Synchronised_Method_Using_Intrrupted();
		ss.seat=30;
		ss.setName("Ram");
		Synchronised_Method_Using_Intrrupted ss1=new Synchronised_Method_Using_Intrrupted();
		ss1.seat=20;
		ss1.setName("Shyam");
		Synchronised_Method_Using_Intrrupted ss2=new Synchronised_Method_Using_Intrrupted();
		ss2.seat=10;
		ss2.setName("Ghanshyam");
		ss.start();
		ss1.start();
		ss2.start();
		
		
	}
}
	


