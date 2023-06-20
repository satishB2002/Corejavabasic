//Q2.Write a program to take input first and last range and print palindrome  Series between given range.take input in constructor and print in result method.
package PreviousPractice21Dec;
import java.util.*;
public class Constructor_Method {
	int i,j,t,k,n,rem,rev;
	Scanner sc=new Scanner(System.in);
	Constructor_Method()
	{
	System.out.println("Enter your First Range");
	k=sc.nextInt();
	System.out.println("Enter your Last Range");
	n=sc.nextInt();
	}
	public void result()
	{
	for(i=k;i<=n;i++)
	{
		rev=0;
		t=i;
		while(t!=0)
		{
			rem=t%10;
			rev=rev*10+rem;
			t=t/10;
		}
		if(rev==i)
			System.out.println(i+" ");
	
	}
	
	}
	public static void main(String arg[])
	{
		Constructor_Method sb=new Constructor_Method();
		sb.result();
	}

}
