package Practice;

public class Constructor_Overloading {
	Constructor_Overloading()
	{
		System.out.println("First Consructor Called");
	}
	Constructor_Overloading(int a)
	{
		this();
		System.out.println("Second Consructor Called"+a);
	}
	Constructor_Overloading(int a,int b)
	{
		this();
		System.out.println("Third Consructor Called"+(a+b));
	}
	public static void main(String arg[])
	{
		Constructor_Overloading ss=new Constructor_Overloading(10,20);
	}
	
}
	
