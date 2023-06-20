package AssConstructor;
import java.util.*;
public class NoReturnWithArgFreq {
	public static void main(String arg[])
	{
		int a[]=new int [10];
		int b[]=new int [a.length];
		duplicat sc=new duplicat();
		sc.input(a,b);
		sc.disp(a,b);
	}

}
class freq
{
	Scanner sb=new Scanner(System.in);
	int i,j,v=-1,c;
public void input(int a[],int b[])
	{
	System.out.println("Enter First Array Element");
	for(i=0;i<a.length;i++)
	{
		a[i]=sb.nextInt();
	}
	for(i=0;i<a.length;i++)
	{c=1;
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
	System.out.println("Frequency of Element");
	
	for(i=0;i<a.length;i++)
	{
		if(b[i]!=v)
		{
			System.out.println(a[i]+" "+b[i]);
		}
	}
	}
		
	}
class duplicat extends  freq
{
	int i,j,v=-1,c;
	public void disp(int a[],int b[])
	{
		System.out.println("Enter Second  Array Element");
		for(i=0;i<a.length;i++)
		{
			a[i]=sb.nextInt();
		}
		for(i=0;i<a.length;i++)
		{c=1;
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
		System.out.println("Duplicate Element");
		for(i=0;i<a.length;i++)
		{
			if(b[i]!=v)
			{
				System.out.println(a[i]+" ");
			}
		}
		}
	}


