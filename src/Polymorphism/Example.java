package Polymorphism;
import java.util.*;
public class Example {
	public void input()
	{
		System.out.println("Second method");
	}
	public void input(int a)
	{
		System.out.println("First method"+a);
	}
	
	public static void main(String arg[])
	{
		Example ss=new Example();
		ss.input();
		ss.input(10);
	}
}
