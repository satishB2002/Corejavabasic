/*Q3.Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the missing number from the first N integers.
  Note: There are no duplicates in the list.
  Examples: 

 Input: arr[] = {1, 2, 4, 6, 3, 7, 8}, N = 8
 Output: 5*/
package AssInheritance;
import java.util.*;
class integers
{
	int i,j;
	int []a={1,2,3,4,6,7,8};
	int sum;
	int totalsum;
	int missing;
	int n;
	integers()
	{
		n=a.length+1;
		for(i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			totalsum=n*(n+1)/2;
			missing=totalsum-sum;
		}
		System.out.println("sum="+sum);
		System.out.println("Missing no="+missing);
	}
}

public class quetion14 {
	public static void main(String arg[])
	{
		integers sc=new integers();
	}

}
