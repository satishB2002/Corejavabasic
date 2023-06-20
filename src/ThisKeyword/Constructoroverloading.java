
package ThisKeyword;

public class Constructoroverloading {
	Constructoroverloading()
	{
		this(10,20,30);
		System.out.println("Default Cnstructor called");
	}
	Constructoroverloading(int a)
	{
		this();
		System.out.println("Parameter Cnstructor called"+a);
	}
	Constructoroverloading(int a,int b)
	{
		this();
		System.out.println("Parameter 2nd Cnstructor called"+a+b);
	}
	Constructoroverloading(int a,int b,int c)
	{
		
		System.out.println("Parameter 3rd Cnstructor called"+a+b+c);
	}
	public static void main(String arg[])
	{
		Constructoroverloading sc=new Constructoroverloading(10,20);
	}
}
