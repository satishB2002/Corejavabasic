//Q2.Wap input a no and find the factorial
package NORETURNNOARGUMENT_exm;
import java.util.*;
public class factorial {
	int t,num,fact;
Scanner sc=new Scanner(System.in);
public void input()
{
	System.out.println("Enter no");
	num=sc.nextInt();
	
}
public void disp()
{

	fact=1;
	for(int i=1;i<=num;i++)
	{
		fact=fact*i;
		
	}
	System.out.println("Factorial="+fact);
	
}
public static void main(String arg[])
{
	factorial ss=new factorial();
	ss.input();
	ss.disp();
}

}
