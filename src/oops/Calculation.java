package oops;

import java.util.Scanner;

public class Calculation
{
int a,b,sum,sub,mul,div,avg;
Scanner sc = new Scanner(System.in);
public void input()
{
	System.out.println("Enter first number");
	a=sc.nextInt();
	System.out.println("Enter second number");
	b=sc.nextInt();
	
}
public void sum()
{
	sum=a+b;
	System.out.println("sum of number ="+sum);
}
public void sub()
{
	sub=a-b;
	System.out.println("sub of number ="+sub);
}
public void mul()
{
	mul=a*b;
	System.out.println("mul of number ="+mul);
}
public void div()
{
	div =a/b;
	System.out.println("div of number ="+div);
}
public void avg()
{
	avg=sum/2;
	System.out.println("avg of number ="+avg);
	
}
public static void main(String arg[])
{
	Calculation sc = new Calculation();
	sc.input();
	sc.sum();
	sc.mul();
	sc.div();
	sc.sub();
	sc.avg();
}




}
