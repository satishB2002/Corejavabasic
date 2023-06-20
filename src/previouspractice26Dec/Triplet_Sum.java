/*Q5.Given an array and a value, find if there is a triplet in array whose sum is equal to the given value. 
If there is such a triplet present in array, then print the triplet and return true. Else return false.

Examples: 
 

Input: array = {12, 3, 4, 1, 6, 9}, sum = 24; 
Output: 12, 3, 9 */
package previouspractice26Dec;
import java.util.*;
public class Triplet_Sum {
	int i,j,k,c=0;
	
	Scanner sc=new Scanner(System.in);
	public boolean input(int a[])
	{
		
		System.out.println("Enter Your Sum");
		int sum=sc.nextInt();
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				for(k=j+1;k<a.length;k++)
				{
					if(a[i]+a[j]+a[k]==sum)
					{
						c++;
	System.out.print("Triplet in Array =="+a[i]+" "+a[j]+" "+a[k]+" ");
 
					}
					
				}
			}
			
		}
		if(c==0)
			return false;
		else
		return true;
		
		
	}
	public static void main(String arg[])
	{
		int a[]= {12, 3, 4, 1, 6, 9};
		Triplet_Sum  ss=new Triplet_Sum ();
		ss.input(a);
		
	}

}
