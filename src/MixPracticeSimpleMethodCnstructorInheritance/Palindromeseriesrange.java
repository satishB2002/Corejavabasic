package MixPracticeSimpleMethodCnstructorInheritance;
//Q7:Write a program to  input first and last number and print palindrome series between inputed range.
import java.util.*;

public class Palindromeseriesrange {
	{
	int k,n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your start Range");
	k=sc.nextInt();
	System.out.println("Enter To have Last Range");
	n=sc.nextInt();
	while(k<=n)
		{
			int rem,rev=0,t;
		t=k;
		while(t!=0)
		{
			rem=t%10;
			rev=rev*10+rem;
			t=t/10;
		}
		if(rev==k)
		{
			System.out.println(k+" ");
		}
		k++;
		}
	}
	public static void main(String arg[])
	{
		Palindromeseriesrange sc=new Palindromeseriesrange();
	}
	}
	


