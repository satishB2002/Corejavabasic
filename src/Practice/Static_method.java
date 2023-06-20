package Practice;

public class Static_method {
static int a=10,b=100;
int p=56,q=68;
public void disp()
{
	System.out.println("\n\nValue of Non Static Method");
	System.out.println(p+" "+q+" "+a+" "+b+" ");
}
public static void disp2()
{
	a++;
	a++;
	
	
	System.out.println("\n\nValue of  Static Method");
	System.out.println(" "+a+" "+b+" ");
}
public static void main(String arg[])
{
	Static_method  sc=new Static_method ();
	sc.disp();
	System.out.println("\n\nDirect Static Method");
	disp2();
	System.out.println("\n\nDirect Class name.method name");
	Static_method.disp2();
}
}
