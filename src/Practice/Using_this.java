package Practice;

public class Using_this {
public void input()
{
	System.out.println("First Method Call");
}
public void input1()
{
	this.input();
	System.out.println("Second Method Call");
}public void input2()
{
	this.input1();
	System.out.println("Three Method Call");
}public void input3()
{
	this.input2();
	System.out.println("Fourth Method Call");
}
public static void main(String arg[])
{
	Using_this ss=new Using_this();
	ss.input3();
}
}
