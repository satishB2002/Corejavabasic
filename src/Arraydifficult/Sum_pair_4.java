package Arraydifficult;
/*Q4.Given an array of N integers, and a number sum, the task is to find the number of pairs of integers in the array whose sum is equal to sum.

Examples:  

Input:  arr[] = {1, 5, 7, -1}, sum = 6
Output:  2*/
import java.util.*;
public class Sum_pair_4 {
	int i,j,sum,c;
	int a[]= {1,5,7,-1};
	Scanner sc=new Scanner(System.in);
	
	public void disp()
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
	public static void main(String arg[])
	{
		Sum_pair_4 sc=new Sum_pair_4();
		sc.disp();
	}
	
	

}
