//Q8.Given an array and a number K where K is smaller than the size of the array. Find the K’th smallest element in the given array.
package Abstractionpractice23Dec;
import java.util.*;
abstract class MM
{
	public abstract void input2();
}
public class Smallest_k extends MM{
	int i,j,t,k;
	int a[]=new int[10];
Scanner sc=new Scanner(System.in);


public void input2() {
	System.out.println("Enter Array");
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();

	}
	System.out.println("Search your Smallest K");
	k=sc.nextInt();
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
	System.out.println("Smallest K="+a[k-1]);
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]+" ");
	}
		
	System.out.println("Smallest K="+a[k-1]);	
	
}
	public static void main(String arg[])
	{
		 Smallest_k ss=new  Smallest_k();
		ss.input2();
	}
}


