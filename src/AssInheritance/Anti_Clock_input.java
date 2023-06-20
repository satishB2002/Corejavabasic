package AssInheritance;
import java.util.*;
public class Anti_Clock_input {
public static void main(String arg[])
{
	clock_user  sb=new clock_user ();
	sb.disp();
}
}
class HHHHH 
{
	Scanner sc = new Scanner(System.in);
	
	int i,x;
	int a[]=new int[5];
	HHHHH ()
	{
	
	
	
	System.out.println("Enter Anti array element");

	for(i=0;i<a.length;i++)
	{
		
		a[i]=sc.nextInt();
	}
	x=a[0];
	for(i=1;i<a.length;i++)
	{
		a[i-1]=a[i];
		
	}
	a[a.length-1]=x;
	for(i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" "+" ");
	}
	}
}
class clock_user extends  HHHHH 
{
	//Scanner sd=new Scanner(System.in);
	public void disp()
	{
		System.out.println("\nEnter Clock array element");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		x=a.length;
		for(i=a.length-2;i>=0;i--)
		{
			
			a[i+1]=a[i];
			
		}
		a[0]=x;
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" "+" ");
		}
		
	}
}