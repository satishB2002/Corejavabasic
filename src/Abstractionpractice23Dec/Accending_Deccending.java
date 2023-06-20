package Abstractionpractice23Dec;
import java.util.*;
abstract class disp3
{
	public abstract void result();
}
public class Accending_Deccending extends disp3{
	int i,j,t;
	int a[]=new int[10];
Scanner sc=new Scanner(System.in);

@Override
public void result() {
	System.out.println("Enter Array");
for(i=0;i<a.length;i++)
{
	a[i]=sc.nextInt();
}
System.out.println("Accendig");	
	for(i=0;i<a.length;i++)
	{
		for(j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
	}
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]+" ");
	}
	System.out.println("Deccending");	
	for(i=0;i<a.length;i++)
	{
		for(j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
	}
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]+" ");
	}
}
public static void main(String arg[])
		{
	Accending_Deccending  ss=new Accending_Deccending ();
	ss.result() ;
		}
	
}

