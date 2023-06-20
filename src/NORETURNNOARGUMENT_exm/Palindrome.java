//Q1.Wap input a no and check it is palindrome or not.
package NORETURNNOARGUMENT_exm;
import java.util.*;
public class Palindrome {
int num,t,rem,rev;
Scanner sc=new Scanner(System.in);
public void input()
{
	System.out.println("Enter no");
	num=sc.nextInt();
	
}
public void disp()
{
	t=num;
	rev=0;
	while(t!=0)
	{
		rem=t%10;
		rev=rev*10+rem;
		t=t/10;	
	}
	if(rev==num)
	{
		System.out.println("Palindrome");
	}
	else
		System.out.println("Not palindrome");
	
}
public static void main(String arg[])
{
	Palindrome ss=new Palindrome();
	ss.input();
	ss.disp();
}
}
