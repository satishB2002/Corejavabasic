package Method_Overloading;
//##
import java.util.*;
class Relax
{
	
void input()
{
	System.out.println("First Class ");
}
	
	
}
public class Hello extends Relax{
	void input()
	{
		System.out.println("Second class  ");
	}
	public	static void main(String arg[])
	{
		 Hello ss=new  Hello();
		 ss.input();
		 Relax sd=new Relax();
		 sd.input();
		
	}

}
