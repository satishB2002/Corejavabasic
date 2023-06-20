//Q5. JAVA Program to Perform Arithmetic calculations using switch case.

package PreviousPractice21Dec;
import java.util.*;

public class Arithmatic_Clculations {
	int a,b,sum,sub,mul,div;
	Scanner sc=new Scanner(System.in);
	Arithmatic_Clculations()
	{
		System.out.println("Enter First no");
		a=sc.nextInt();
		System.out.println("Enter Second no");
		b=sc.nextInt();
		
	}
	public void sum()
	{
		sum=a+b;
		System.out.println("The Addition="+sum);
	}
	public void sub()
	{
		sub=a-b;
		System.out.println("The Substaction="+sub);
	}
	public void mul()
	{
		mul=a*b;
		System.out.println("The  Multiplication="+mul);
	}
	public void div()
	{
		div=a/b;
		System.out.println("The Division="+div);
	}
	public static void main(String arg[])
	{
		Arithmatic_Clculations sb=new Arithmatic_Clculations();
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter 1 to Addition");
		System.out.println("Enter 2 to Substaction");
		System.out.println("Enter 3 to Multiplication");
		System.out.println("Enter 4 to Division");
		
		System.out.println("Enter number");
		int n=ss.nextInt();
		switch(n)
		{
		case 1:
		sb.sum();
		break;
		case 2:
		sb.sub();
		break;
		case 3:
		sb.mul();
		break;
		case 4:
		sb.div();
		break;
		default:
			System.out.println("WRONG CHOICE");
		}
	}

}
