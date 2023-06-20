//Q8.Write a Java program to find all combination of four elements of a given array whose sum is equal to a given value.
package MixArraypattern_20_22;
import java.util.*;
public class Combination_pair {
	int i,j,k,l,sum,c;
	int a[]= {1,2,3,4,5,6,7};
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		
		System.out.println("\nElemenr in Array");
    	for(i=0;i<a.length;i++)
    	{
    		System.out.print(a[i]+" ");
    	}
		System.out.println("\nEnter Your Sum");
		sc.nextInt();
		c=0;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				for(k=j+1;k<a.length;k++)
				{
					for(l=k+1;l<a.length;l++)
					{
						if(a[i]+a[j]+a[k]+a[l]==sum)
						{
							c++;
						System.out.println("\n"+a[i]+" "+a[j]+" "+a[k]+" "+a[l]+" ");
						}
					}
				}
			}
		}
		System.out.println();
		if(c!=0)
		{
		System.out.println("combination of four elements");
		}
		else
		{
		System.out.println("combination Not four elements");
		}
	}
public static void main(String arg[])
		{
	Combination_pair  ss=new Combination_pair ();
	ss.input();
		}
}
