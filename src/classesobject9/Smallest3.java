package classesobject9;
/*Q8.Take three numbers from the user and print the smallest number*/
import java.util.*;
public class Smallest3 {
int a,b,c;
Scanner sc=new Scanner(System.in);
public void input()
{
	System.out.println("Enter three number");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	if(a<b   &&    a<c)
		System.out.println("A is Smallest");
	if(b<a     &&     b<c)
		System.out.println("B is Smallest");
	if(c<a      &&     c<b)
		System.out.println("C is Smallest");
}
public static void main(String arg[])
{
	Smallest3 sc=new Smallest3();
	sc.input();
}
}
