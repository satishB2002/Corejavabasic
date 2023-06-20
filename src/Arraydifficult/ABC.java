package Arraydifficult;
import java.util.*;
public class ABC extends xyz{
	public void input2()
	{
		System.out.println("Enter Two number");
		System.out.println("Enter no P");
		
		p=sc.nextInt();
		System.out.println("Enter no Q");
		q=sc.nextInt();
	}
	public void disp()
	{
		System.out.println("Sum"+(p+q));
	}
	public static void main(String arg[])
	{
		ABC sc=new ABC ();
		
		sc.input2();
		sc.disp();
	}
}
