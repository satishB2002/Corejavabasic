//Q1.Wap enter an array and find the sum and count of even element.
package ReturntypewithArgumentmethod;

public class Sum_Count_Even {
	int i,j,c,sum;
	
	public int input(int a[])
	{
		sum=0;
		c=0;
		j=2;
		for(i=0;i<a.length;i++)
		{
			if(a[i]%j==0)
			{
			sum=sum+a[i];
			c++;
			}
			

		}
		
		System.out.println("Sum="+sum);
		System.out.println("Count="+c);
		return 0;
		
	}
	public static void main(String arg[])
	{
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		Sum_Count_Even ss=new Sum_Count_Even();
		ss.input(a);
	}

}
