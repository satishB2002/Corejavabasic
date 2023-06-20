package oops;
import java.util.*;
public class Array_max_min {
	int a []= new int [10];
	int i,j,k;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		for(i=0;i<a.length;i++)
			a[i]=sc.nextInt();
	}
	public void max()
	{k=0;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				k=a[i];
			}
		}
		System.out.println("Max of"+k);
	}
	public void min()
	{k=0;
		for(i=1;i>a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				k=a[i];
			}
		}
		System.out.println("Min of"+k);
	}
		public static void main(String arg[])
		{
			Array_max_min sc=new  Array_max_min();
			sc.input();
			sc.max();
			sc.min();
		}
	}


