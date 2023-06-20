package Arraydifficult;
/*Q1.Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[].*/
import java.util.*;
public class occurance_x {
	int i,j,c;
	Scanner sc=new Scanner(System.in);
	public void input(int a[])
	{
		
		System.out.println("Enter array Element");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
				
	}
	public void display(int a[])
	{
		System.out.println("Search occurance ");
		j=sc.nextInt();
		for(i=0;i<a.length;i++)
		{
			a[i]=j;
			
		}
		c++;
		System.out.println("Occurance count is "+c);
	}
	
	public static void main(String arg[])
	{
		int  a[]=new int[10];
		occurance_x  sc=new occurance_x ();
		sc.input(a);
		sc.display(a);
	}


}
