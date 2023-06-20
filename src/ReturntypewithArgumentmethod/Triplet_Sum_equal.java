/*Q18.Given an array and a value, find if there is a triplet in array whose sum is equal to the given value. 
If there is such a triplet present in array, then print the triplet and return true. Else return false.

Examples: 
 

Input: array = {12, 3, 4, 1, 6, 9}, sum = 24; 
Output: 12, 3, 9 */

package ReturntypewithArgumentmethod;

public class Triplet_Sum_equal {
	int i,j,k,sum;
	 
	public int input(int a[])
	{
		sum = 24;
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
		return 0;
	}
	public static void main(String arg[])
	{
		 int a[]= {12, 3, 4, 1, 6, 9};
		Triplet_Sum_equal ss=new Triplet_Sum_equal ();
		ss.input(a);
	}

}
