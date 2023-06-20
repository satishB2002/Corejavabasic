package interface_practce_ass;
import java.util.*;
public class MyClass implements A{
int sum,sub,a=70,b=25; 
	@Override
	public void Math1() {
		sum=a+b;
		System.out.println("Sum="+sum);
		
	}

	@Override
	public void Math12() {
	
		sub=a-b;
		System.out.println("Sub="+sub);
	}
	public static void main(String arg[])
	{
		MyClass ss=new MyClass();
		ss. Math1();
		ss. Math12() ;
	}

}
