package AsswithargNoarg;
/*Q2.Wap enter an array and find the sum and count of odd element.*/

import java.util.*;
public class Oddsumcount {
	Scanner sc=new Scanner(System.in);
	public void input(int a[])
	{
		System.out.println("Enter Number");
		for(int i=0;i<a.length;i++)
		{
			a[i] =sc.nextInt();
		}
	}
	public void display(int a[])
	{		int sum=0;int c=0;
		for(int i=1;i<a.length;i++)
		{
			if(i%2==0)
			{
				sum=sum+a[i];
				c++;
				System.out.println(" "+a[i]);		
			}
		}
		System.out.println("Sum of odd="+sum);	
		System.out.println("Count of odd="+c);	
	
	}
	public static void main(String arg[])
	{
		int n=10;
		int a[]= new int[n];
		Oddsumcount sc=new Oddsumcount();
		sc.input(a);
		sc.display(a);
		
		
		
		
	}

}
