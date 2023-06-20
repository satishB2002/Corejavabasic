package Returntype;
import java.util.*;
public class ReturnSumArea {
	int sum,a,b;

	Scanner sc=new Scanner(System.in);
	public int input()
	{
		System.out.println("Enter two element");
		a=sc.nextInt();
		b=sc.nextInt();
		 sum=a+b;
		return sum;
		
	}
	public double display()
	{
		System.out.println("Enter Radius");
		double r=sc.nextDouble();
		 double area=3.14*r*r;
		return area;
	}
	public static void main(String arg[])
	{
		ReturnSumArea sc=new ReturnSumArea();
		int s=sc.input();
		System.out.println(s);
		double a=sc.display();
		System.out.println(a);
	}

}
