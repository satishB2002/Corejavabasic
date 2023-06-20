package Imp_Quetion;
import java.util.*;
public class Merge_Array
{
int i,j,t;
int a[]= {1,5,6,7,8,10};
int b[]= {2,4,9};
int c[]=new int[a.length+b.length];
int p=a.length;
int q=b.length;
Scanner sc=new Scanner(System.in);
public void input()
{
	for(i=0;i<a.length;i++)
	{
		c[i]=a[i];
		
	}
	for(i=0;i<b.length;i++)
	{
		c[a.length+i]=b[i];
		
	}
	for(i=0;i<c.length;i++)
	{
		System.out.println(c[i]+" ");
		
	}
	for(i=0;i<c.length;i++)
	{
		for(j=i+1;j<c.length;j++)
		{
			if(c[i]>c[j])
			{
				t=c[i];
				c[i]=c[j];
				c[j]=t;
			}
		}
		
	}
	
		
	System.out.println("Third array sorted");
	for(i=0;i<c.length;i++)
	{
		System.out.println(c[i]+" ");
	}
	
}	
public static void main(String arg[])
{
	Merge_Array ss=new Merge_Array();
	ss.input();
}
}


