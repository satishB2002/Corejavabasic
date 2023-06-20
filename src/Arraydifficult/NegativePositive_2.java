package Arraydifficult;
/*Q2.An array contains both positive and negative numbers in random order. Rearrange the array elements so 
that all negative numbers appear before all positive numbers.
 Examples : 

Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5*/
public class NegativePositive_2 {
	int i,j,t;
	public void input(int[]a)
	{
		for(i=0;i<a.length;i++)
		{
			for(j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
					
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String arg[])
	{
		int a[]= {-12,11,-13,-5,6,-7,5,-3,-6};
		NegativePositive_2 sc=new NegativePositive_2();
		sc.input(a);
	}

}
