//Q3.Write a java program to print list repeated element in an array.
package Practice;
import java.util.*;
public class Repeated_Element {
	int i,j,v,c;
	Scanner ss=new Scanner(System.in);
	Repeated_Element (int a[],int b[])
	{
		
		System.out.println("Enter Array");
		for(i=0;i<a.length;i++)
		{
			a[i]=ss.nextInt();
		}
		v=-1;
		 
		for(i=0;i<a.length;i++)
		{   
			c=1;
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					b[j]=v;
					c++;
				}
				
			}
			if(b[i]!=v)
			{
				b[i]=c;
			}
		}
		
	
	for(i=0;i<a.length;i++)
	{
		if(b[i]>0)
		{
			int k=b[i];
		}
			System.out.println(a[i]+" ");
		
	}
	}
	
	public static void main(String arg[])
	{
	
	int a[]=new int[10];
	int b[]=new int[a.length];
	
		Repeated_Element sc=new Repeated_Element (a,b);
		
	}

}
