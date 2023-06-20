/*Q5.Given an array and a value, find if there is a triplet in array whose sum is equal to the given value. 
If there is such a triplet present in array, then print the triplet and return true. Else return false.

Examples: 
 

Input: array = {12, 3, 4, 1, 6, 9}, sum = 24; 
Output: 12, 3, 9 */
package Array_Pattern;
import java.util.*;
public class quetion_5_array {
	int i,j,k,sum,c;
	int a[]= {12,3,4,1,6,9};
	quetion_5_array()
	{
			sum=24;
			
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				for(k=j+1;k<a.length;k++)
				{
					if(a[i]+a[j]+a[k]==sum)
					{
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
						
					}
				}
			}
		}
		
	}
	
	public static void main(String arg[])
	{
			
	quetion_5_array sc=new quetion_5_array();
	}
}
