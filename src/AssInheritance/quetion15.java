/*Q4.Given an array of N integers, and a number sum, the task is to find the number of pairs of integers in the array whose sum is equal to sum.

  Examples:  

  Input:  arr[] = {1, 5, 7, -1}, sum = 6
  Output:  2*/
package AssInheritance;
import java.util.*;

class sum
{
	int i,j,sum,c;
	int a[]= {1,5,7,-11};
	Scanner sc=new Scanner(System.in);
	sum()
	{
		System.out.println("Enter sum");
		sum=sc.nextInt();
		c=0;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==sum)
				{
					c++;
				}
			}
		}
		System.out.println("Output"+c);
	}
}


public class quetion15 {
	public static void main(String arg[])
	{
		sum sc=new sum();
	}

}
