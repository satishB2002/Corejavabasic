//Q3. Wap show all the uses of this keyword.
package MixArraypattern_20_22;
import java.util.*;

import ThisKeyword.methodprint;

public class This_Keyword extends Rule_2{
		int id;
	String name;
	    This_Keyword()
	    {
		
			this(10,20,30);
			System.out.println("Default Cnstructor called");
		}
	   This_Keyword(int a)
		{
			this();
			System.out.println("Parameter Cnstructor called"+a);
		}
	   This_Keyword(int a,int b)
		{
			this();
			System.out.println("Parameter 2nd Cnstructor called"+a+b);
		}
	   This_Keyword(int a,int b,int c)
		{
			
			System.out.println("Parameter 3rd Cnstructor called"+a+b+c);
		}
		
	
//	1:  This can be used to refer current class instance variable
	
	public void input(int id,String name)
	{
		this.id=id;
		this.name=name;
		System.out.println(id+" "+name);
	}
	public static void main(String arg[])
	{
		System.out.println("\n\n\nThird  Rule");
		This_Keyword sb=new This_Keyword(10,20);
		System.out.println("\n\n\nFirst Rule");
		methodprint sc=new methodprint();
		sc.input(121,"satish");
		System.out.println("\n\n\nSecond Rule");
		 Rule_2 sd=new  Rule_2();
		 sd.A13();
		 System.out.println("\n\n\nFourth Rule");
		 Rule_4 sp=new Rule_4 ();
		 sp.input();
		 
		 
		 
		 
		 
		
		
	}
}
class Rule_2 extends Rule_4 
{
	// * 2: This can be call current class method internally

	public void A11()
	{
		System.out.println("Call By  A11");
	}
	public void A12()
	{
		this.A11();
		
		System.out.println("Call By  A12");
	}
	public void A13()
	{
		this.A12();
		System.out.println("Call By  A11");
	}
	
}
class Rule_4 {
	int a,b;
public void input()
{
	dip(this);
	
	
	System.out.println("Hii main method");
}
public void dip(Rule_4 obj)
{
	
	obj.a=1000000000;
System.out.println(obj.a);
	
	System.out.println("Your no is they are");
}
}
