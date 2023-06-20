package Method_Overloading;
class AA1
{
	public void input()
	{
		System.out.println("Parent class called");
	}
}
public class AA extends AA1{
public void input()
{
	System.out.println("Child class called");
}
public static void main(String arg [])
{
	
	AA1 sc=new AA1();
	sc.input();
	AA1 sc1=new AA();
	sc1.input();
}
}
