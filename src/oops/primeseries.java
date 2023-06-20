package oops;
import java.util.Scanner;
public class primeseries {

	
	Scanner sc=new Scanner(System.in);
	int t ,rem,rev;
	public void input(int n)
	{
		int i,j,temp;
		temp=0;
		
		for(i=1;i<n;i++)
		{
			
			for(j=2;j<i-1;j++)
		{
			if(i%j==0)
				temp=i+1;
			
		}
		if(temp==0)
		{
			System.out.println(i+" ");
		}
		
		}
	}
	public void display(int n)
	{
		
	
	t=n;
	rev=0;
	while(t!=0)
	{
		rem=t%10;
		rev=rev*10+rem;
		t=t/10;
	}
	if(rev==n)
	{
		System.out.println("Palindrome ");
	}
	else
	{
		System.out.println("Not  Palindrome");
	}
	}
	
	public static void main(String arg[])
	{
		int n=121;
		
		primeseries sc=new primeseries();
		sc.input(n);
		sc.display(n);	
		}
}
