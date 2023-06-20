package ThisKeyword;

public class methodcall {
	public void method1()
	{
		System.out.println("Method1()is called");
	}
	public void method2 ()
	{
			this.method1();
		
		System.out.println("Method2()is called");
	}
	public void method3()
	{
		this.method2();
		System.out.println("Method3()is called");
	}
	public void method4()
	{
		this.method3();
		System.out.println("Method4()is called");
	}
	public void method5()
	{
		this.method4();
		System.out.println("Method5()is called");
	}
	public static void main(String arg[])
	{
		methodcall sc=new methodcall();
		sc.method5();
	}
	
}
