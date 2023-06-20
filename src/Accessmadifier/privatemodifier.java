package Accessmadifier;
import java.util.*;
public class privatemodifier {
	
Scanner sb=new Scanner(System.in);
 public  int id;
   private String name;
	public void input1()
	{
		System.out.println("Enter id");
		id=sb.nextInt();
		System.out.println("Enter name");
		name=sb.next();
	}
	public void disp()
	{
		System.out.println(id+" "+name);
	}
	
	
	public void disp2()
	{
		
		input1();
		disp();
		
	}
	public static void main(String arg[])
	{
		privatemodifier sb=new privatemodifier();
		sb.input1();
		sb.disp();		
	
	}

}
