package Interface;
import java.util.*;
public class practice_1 implements Practice1{
	
	int i,j,k,n;
	Scanner sc=new Scanner(System.in);
	@Override
	public void input() {
		
		for(i=0;i<=5;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			for(j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			for(j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			for(j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	
	@Override
	public void dosplay() {
		
		for(i=0;i<=5;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
		System.out.println();
		System.out.println();
	}
	@Override
	public void display1() {
		System.out.println("Enter Your rotate");
		n=sc.nextInt();
		for(k=1;k<=n;k++)
		{
	for(i=0;i<=5;i++)
	{
		for(j=5;j>=i;j--)
		{
			System.out.print("*");
		}
		for(j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(j=5;j>=i;j--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(i=5;i>=1;i--)
	{
		for(j=5;j>=i;j--)
		{
			System.out.print("*");
		}
		for(j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(j=5;j>=i;j--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println();
	System.out.println();
		}
		
	}
	public static void main(String arg[])
	{
		practice_1 ss=new practice_1();
		ss.input();
		ss.dosplay();
		ss.display1();
		
	}
	

}
