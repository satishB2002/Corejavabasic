/*Q4.Given an array of N integers, and a number sum, the task is to find the number of pairs of integers 
   in the array whose sum is equal to sum.

Examples:  

Input:  arr[] = {1, 5, 7, -1}, sum = 6
Output:  2*/
package Array_Pattern;
import java.util.*;
public class Array_quetion_4 {
	int i,j,k,c,sum;
	int a[]= {1,5,7,-1};
	Array_quetion_4 ()
	{
		sum=6;
		c=0;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				for(k=j+1;k<a.length;k++)
				{
					if(a[i]+a[j]==sum)
					{
						System.out.println(a[i]+" "+a[j]);
						c++;
					}
				}
			}
		}
		System.out.println("Count of Sum="+c);
	}
	public static void main(String arg[])
	{
		Array_quetion_4 sc=new Array_quetion_4();
	}

}
