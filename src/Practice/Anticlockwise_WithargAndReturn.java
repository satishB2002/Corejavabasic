package Practice;
import java.util.*;
public class Anticlockwise_WithargAndReturn {
	int i,j,x;
	Scanner sc=new Scanner(System.in);
public int input(int a[])
{
	System.out.println("Enter Array");
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	a[0]=x;
	for(i=1;i<a.length-1;i++)
	{
		a[i-1]=a[i];
	}
	x=a[a.length-1];
	for(i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	return 0;
}

public static void main(String arg[])
		{
	int a[]=new int[5];
	Anticlockwise_WithargAndReturn cs=new Anticlockwise_WithargAndReturn();
	
	cs.input(a);
		}
}
