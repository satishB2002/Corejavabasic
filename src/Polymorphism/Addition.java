package Polymorphism;
import java.util.*;
public class Addition {
	Scanner sc=new Scanner(System.in);
	public void sum()
	{
	int	a=10,b=5;
	System.out.println("First Method is Sum"+(a+b));
	}
	public int sum(int a)
	{
		System.out.println("Single value A="+a);
		return a;
	}
	public double sum(int a,int b)
	{
		System.out.println(" Sum of Two="+(a+b));
		return a+b;
	}
	public float sum(int a,float b,int c)
	{
		System.out.println(" Sum of three="+(a+b+c));
		return a+b+c;
	}
	public boolean sum(boolean a,boolean b)
	{
	 
		System.out.println("Boolean=="+a+" "+b);
		return true;
	}
	public String sum(String Firstname,String Lastname)
	{
		System.out.println("Enter Your First name");
		Firstname=sc.next();
		System.out.println("Enter Your Last name");
		Lastname=sc.next();
		System.out.println(Firstname+Lastname);
		return Firstname+Lastname;
	}
	public static void main(String arg[])
	{
		Addition ss=new Addition();
		ss.sum();
		ss.sum(10);
		ss.sum(10,20);
		ss.sum(10,20,30);
		ss.sum("Satish","Barate");
		ss.sum(true ,false);
		
	}

}
