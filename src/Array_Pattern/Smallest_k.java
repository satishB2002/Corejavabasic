/*Q1.Given an array and a number K where K is smaller than the size of the array. 
   Find the K’th smallest element in the given array. Given that all array elements are distinct.

Examples:  

Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
Output: 7*/
package Array_Pattern;
import java.util.*;
public class Smallest_k {
	int i,j,k,t;

Scanner sc=new Scanner(System.in);
	Smallest_k(int a[])
	{
		System.out.println("Enter Array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
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
			System.out.println("enter your k");
			k=sc.nextInt();
			System.out.println(" ="+a[k-1]);
		
		
	}

public static void main(String arg[])
{
	int a[]=new int[6];
	Smallest_k sb=new Smallest_k (a);
	
}
}