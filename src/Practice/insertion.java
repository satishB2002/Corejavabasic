package Practice;
import java.util.*;
public class insertion {
public static void main (String arg[])
{
	Scanner sc=new Scanner(System.in);
	int i,pos ,ele,n;
	n=10;
	
	System.out.println("Enter Array Element");
	int a[]=new int[n+1];
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Enter pos");
	pos=sc.nextInt();
	System.out.println("Enter Ele");
	ele=sc.nextInt();
	
	for(i=a.length-1;i>=pos;i--)
	{
		a[i]=a[i-1];
	}
	a[pos]=ele;
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]+" ");
	}
}
}
