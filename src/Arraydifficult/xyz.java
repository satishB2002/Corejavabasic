package Arraydifficult;
import java.util.*;
public class xyz extends inheritance_1{
	
	Scanner sc=new Scanner(System.in);
	public void input1()
	{
		System.out.println("Enter Two number");
		System.out.println("Enter no A");
		
		a=sc.nextInt();
		System.out.println("Enter no B");
		b=sc.nextInt();
	}
	
	
	public void disp1()
	{
	
		System.out.println(" sum of "+(a+b));
	}

	public static void main(String arg[])
	{
		xyz sc=new xyz();
		sc.input1();
		sc.disp1();
	}
	
}

