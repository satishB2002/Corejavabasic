package MethodPractice;
import java.util.Scanner;
public class Returntypewithargument {
	
public int square(int n)
{
	return n*n;
}
public static void main(String arg[])
{
	
	Returntypewithargument sc =new Returntypewithargument();
	
	Scanner sb=new Scanner(System.in);
	System.out.println("Enter number");
	sb.nextInt();
	System.out.println(sc.square(22));
}
}
