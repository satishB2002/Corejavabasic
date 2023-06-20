package Daemon_Thread;
class LPG
{
	public void Cng() {
		System.out.println(" Old Old Parent ");	}
}
class Xyz extends LPG
{
	public void disp() {
		System.out.println("Old Parent ");	}
}
class Abc //extends Xyz
{
	public void input() {
		System.out.println("Parent class");
	}
}
public class Runnable_Thread extends Abc implements Runnable {

private static final String Thread = null;
@Override
public void run() {
	// TODO Auto-generated method stub
	//System.out.println("Runnable Start");
	System.out.println("Patent Thread Strated");
	for (int i = 1; i <=5; i++) {
		System.out.println(i);
	}
	
}

public static void main(String[] args) {

	Runnable_Thread sd=new Runnable_Thread();
	//sd.disp();
	//sd.Cng();
	
	sd.input();
	
	Thread ss=new Thread(sd);
	ss.start();
	ss.yield();
	System.out.println("Main Thread ");
	for (int i = 6; i <=10; i++) {
		System.out.println(i);
	}
}
}
