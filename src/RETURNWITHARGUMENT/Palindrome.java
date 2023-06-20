//Q1.Wap input a no and check it is palindrome or not.
package RETURNWITHARGUMENT;
import java.util.*;
public class Palindrome {
int t,rem,rev;
Scanner sc=new Scanner(System.in);

public int disp(int num)
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
	return 0;
}
public static void main(String arg[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no");
	int num=sc.nextInt();
	
	Palindrome ss=new Palindrome();
	
	ss.disp(num);
}
}
