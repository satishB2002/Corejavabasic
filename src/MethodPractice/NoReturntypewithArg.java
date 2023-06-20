package MethodPractice;
/*Q1.
Using no-return type with argument
Create a menu program
1. Insertion of Array
2. Deletion of Array
3. Serachig of Element in Array
4. Reverse Of an array. */
import java.util.*;
public class NoReturntypewithArg {
	int i,j;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("\t\t\t\t:Menu:");
		System.out.println("1.insertion ");
		System.out.println("2.deletion ");
		System.out.println("3.searching ");
		System.out.println("4.reverse");
	}
	public void insretion(int a[])
	{
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println("Enter your element you have insert");
		int ele=sc.nextInt();
		for(i=a.length-1;i>ele-1;i--)
		{
			a[i]=a[i-1];
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	public void deletion(int a[])
	{
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	System.out.println("Enter number You have delete");
	int k=sc.nextInt();
	for( i=k-1;i<a.length-1;i++)
	{
		a[i]=a[i+1];
	}
	for(i=0;i<a.length-1;i++)
	{
	System.out.println(" "+a[i]);
	}
	}
	public void searching(int a[])
	{
			int c=0;
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println("Enter you want search element");
		int s=sc.nextInt();
		for(i=0;i<a.length;i++)
		{
			if(a[i]==s)
			c++;
		}
		if(c==0)
			System.out.println(" Your Element not found");
		else
			System.out.println(" Your Element found");
		
	}
	public void reverse(int a[])
	{
		for( i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		
		
	}
	
	public static void main(String arg[])
	{
		Scanner sb=new Scanner(System.in);
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		NoReturntypewithArg sc=new NoReturntypewithArg();
		sc.input();
		System.out.println("Enter your choice");
		int ch=sb.nextInt();
		switch(ch)
		{
		case 1:sc.insretion(a);
		break;
		case 2:sc.deletion(a);
		break;
		case 3:sc.searching(a);
		break;
		case 4:sc.reverse(a);
		break;
		default:
			System.out.println("Wromg choice");
		
	}
	}
}
