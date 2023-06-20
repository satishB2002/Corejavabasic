package Practice;

import java.lang.reflect.Method;

public class Argunt_Returntype {
	int sum=0;
	public int input(int a,int b)
	{
		sum=a+b;
		return sum;
	}
	public static void main(String[] args) {
		int a=20;
		int b=32;
		Argunt_Returntype ss=new Argunt_Returntype();
		//ss.input(a, b);
		System.out.println("Your Sum is");
		System.out.println(ss.input(a,b));
	}
}
