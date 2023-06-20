package ThisKeyword;

public class Rule_4 {
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
public static void main(String arg[])
{
	Rule_4 sc=new Rule_4();
	sc.input();
}

}