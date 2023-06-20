package Strin_Buffer;
import java.util.*;
public class append_Example {
	String Abc;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter Your String");
		Abc=sc.nextLine();
		StringBuffer sf=new StringBuffer(Abc);
		//sf.append("Barate");
		System.out.println(sf);
		
		System.out.println(sf.subSequence(2, 5));
		
		
	}
	public static void main(String arg[])
	{
		append_Example ssAppend_Example=new append_Example();
		ssAppend_Example.input();
	}

}
