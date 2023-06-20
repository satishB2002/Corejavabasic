package Returntype;
import java.util.*;
public class Greatest3among {
int a,b,c;
Scanner sc=new Scanner(System.in);
public void input()
{
	System.out.println("Enter number");
	a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    }
public int gratest()
{
	if(a>b && a>c)
		return a;
	else if(b>a  && b>c)
		return b;
	else 
		return c;
		
}
public static void main(String arg[])
{
	Greatest3among sc=new Greatest3among();
	sc.input();
	int x=sc.gratest();
	System.out.print(x);
}
}
