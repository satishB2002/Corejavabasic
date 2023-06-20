//Question 1: Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.

package Thread;
class welcome
{
	public void wel() {
		for (int i = 1; ;) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(" :: Welcome ::");
		}
		
	}
}
public class Quetion_1 extends welcome implements Runnable{
int i,j;

public void run() {
	for (int i = 1; ;) {
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("  !!!  Good Morning  !!!");
	}
	
}
public static void main(String[] args) {
	Quetion_1 ss=new Quetion_1();
	Quetion_1 ss1=new Quetion_1();
	ss.run();
	ss.wel();
}
}
