package MethodPractice;
/*Q2.

Using return type with no-argument
Create a menu program
1. Insertion of Array
2. Deletion of Array
3. Serachig of Element in Array
4. Reverse Of an array. */
import java.util.*;
public class UsingreturntypeNoargument {
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	int i,ch;
	int ele;
	Scanner sc=new Scanner(System.in);
	
public void input()
{
	System.out.println("\t\t\t\t::Menu::");
	System.out.println("1.Insertion ");
	System.out.println("2.Deletion ");
	System.out.println("3.Searching ");
	System.out.println("4.Reverse ");
	
}
public int  result()

{
	System.out.println("Enter Your choice");
	 ch=sc.nextInt();
	switch(ch)
	{
	case 1:
	
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]+" ");
		
	}
	System.out.println("Enter your Element");
	  int s=sc.nextInt();
	
	for(i=a.length-1;i>s-1;i--)
	{
		a[i]=a[i-1];
	}
	
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]+" ");
		
	}
	break;
	//2. Deletion of Array
	case 2:
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println("Enter you want Delete element");
		ele =sc.nextInt();
		for(i=ele-1;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		for(i=0;i<a.length-1;i++)
		{
			System.out.println(" "+a[i]);
		}
		break ;
	case 3:
		int c=0;
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println("Enter you want search element");
		int d=sc.nextInt();
		for(i=0;i<a.length;i++)
		{
			if(a[i]==d)
			c++;
		}
		if(c==0)
			System.out.println(" Your Element not found");
		else
			System.out.println(" Your Element found");
		break ;
	case 4:
		for( i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		break;
	default:
		System.out.println("Wrong Choice");
	}
	
	return 0;
	}

	public static void main(String arg[])
	{
		UsingreturntypeNoargument sc =new UsingreturntypeNoargument();
		sc.input();
		sc.result();
		
	
}
}
