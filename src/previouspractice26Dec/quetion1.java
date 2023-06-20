/*Q1.Given an array of integers arr[], The task is to find the index of first repeating element in it i.e.
   the element that occurs more than once and whose index of the first occurrence is the smallest. */
package previouspractice26Dec;
import java.util.*;
public class quetion1 {
	int i,j;
	int a[]=new int[5];
	int n=a.length;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter Array element");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("the no is="+a[i]);
					System.out.println("the index is="+i);
					i=n;
					j=n;
				
				 
				}
				}
			}
		 
		}
	

	public static void main(String arg[])
	{
		 quetion1 ss=new  quetion1();
		 ss.input();
	}

}
