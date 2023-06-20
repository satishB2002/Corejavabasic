/*Q17.Given an array of N integers, and a number sum, the task is to find the number of pairs of integers 
   in the array whose sum is equal to sum.

Examples:  

Input:  arr[] = {1, 5, 7, -1}, sum = 6
Output:  2*/
package ReturntypewithArgumentmethod;

public class Pair_of_integer {
	int i,j,sum=6,c;
	public int input(int a[])
	{
		c=0;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==sum)
				{
					c++;
					System.out.println(a[i]+" "+a[j]);
				}
				
			}
		}
		System.out.println("Pair of Count="+c);
		
		
		return 0;
	}
	public static void main(String arg[])
	{
	int 	a[] = {1, 5, 7, -1};
		Pair_of_integer ss=new Pair_of_integer();
		ss.input(a);
	}

}
