package Method_Overloading;

class Parent
{
	int sum=0;
	public void  input(int a)
	{
		sum=sum+a;
		System.out.println("First Sum="+sum);
		
	}
public 	void input(int a,double b)
	{
		
		System.out.println("Second Sum="+(a+b));
	}
	public void input(float a,double b,double c)
	{
		
		System.out.println("Second Sum="+(a+b+c));
	}
}
public class Upcasting extends Parent{
	public static void main(String arg[])
	{
		Upcasting ss=new Upcasting();	
		ss.input(10);
		ss.input(10,20);
		ss.input(10,20,30);
		
	}

}
