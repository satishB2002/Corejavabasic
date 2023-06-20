package Constructor;

import java.io.PrintStream;

public class Constructor_Chaining {
	int a=10;
	Constructor_Chaining() {
		System.out.println(10);
	}
	Constructor_Chaining(String Str)
	{
		this();
		System.out.println(Str);
	}
	Constructor_Chaining(Constructor_Chaining sp)
	{
		this.a=a;
		System.out.println(a);
	}
	public void name() {
		
	}
	public static void main(String[] args) {
		Constructor_Chaining ss=new Constructor_Chaining("Satish");
		
		
	}
}
