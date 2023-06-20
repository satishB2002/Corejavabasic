package Inheritance1;


import java.util.*;


public class Class2 extends Class1{
	Scanner sc=new Scanner(System.in);

	    void result()
	{
		System.out.println("Enter element");
	  a=sc.nextInt();
	  b=sc.nextInt();
	  System.out.println("sum"+(a+b));
	}
	   public static void main(String arg)
	   {
		   Class2  sc=new Class2 ();
		   sc.result();
	   }
}