package Arraydifficult;
/*Q3.Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the missing number from the first N integers.
Note: There are no duplicates in the list.
Examples: 

Input: arr[] = {1, 2, 4, 6, 3, 7, 8}, N = 8
Output: 5*/
public class Missing_number {
	int i;
	int sum;
	int n;
	int toalsum;
	int missing;
	public void main(int a[])
	{
		n=a.length+1;
		for(i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			toalsum=n*(n+1)/2;
			missing=toalsum-sum;
		}
		System.out.println("sum="+sum);
		System.out.println("Missing no="+missing);
	}
	/*public void disp(int a[])
	{
		for(i=0;i<a.length;i++)
		{
			missing=toalsum-sum;
		}
		System.out.println("Missing no="+missing);
	}*/
	public static void main(String arg[])

	{
		int a[]= {1,2,3,4,6,7,8};
		Missing_number  sc=new Missing_number ();
		sc.main(a);
		//sc.disp(a);
	}
}
