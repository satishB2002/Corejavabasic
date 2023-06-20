package AsswithargNoarg;
import java.util.*;
public class HalfaccHalfdes {
	int i,j,t;
	public void accen(int a[],int b[])
	{
		for(i=0;i<a.length/2;i++)
		{
			for(j=i+1;j<a.length/2;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(i=0;i<a.length/2;i++)
		{
			b[i]=a[i];
		}
	}
public void input(int a[],int b[])
{
for(i=a.length/2;i<a.length;i++)
{
	for(j=i+1;j<a.length;j++)
	{
		if(a[i]<a[j])
		{
			t=a[i];
			a[i]=b[i];
			b[i]=t ;
		}
	}
}
for(i=a.length/2;i<a.length;i++)
{
	b[i]=a[i];
}
	
}

	public void display(int a[],int b[])
	{
		for(i=a.length/2;i<a.length;i++)
		{
			System.out.println(b[i]+" ");
		}
	}
	public static void main(String arg[])
	{
		int a[]= {1,87,66,44,77,33,44,22,9,55};
		int b[]=new int[a.length];
		HalfaccHalfdes sc=new HalfaccHalfdes();
		sc.accen(a,b);
		sc.input(a,b);
	}

}
