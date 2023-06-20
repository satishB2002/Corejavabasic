package AssClassloaderwithMethod;
/*Q13.Wap input a matrix and find thr sum and average.*/
public class quetion_13 {
	int i,j,sum,Avg,size;
	quetion_13 ()
	{
		
	int i,j;
	int a[][]= {
			{1,2,3},
			{4,5,6},
			{7,8,9}
			    };
	size=a.length*a[0].length;
	System.out.println("Sum of Matrix");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			sum=sum+a[i][j];
		}
		
	}
	System.out.println(" "+sum);
	System.out.println("Average of Matrix");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			Avg=sum/size;
		}
		
		
		
	}
	System.out.print("  "+Avg);
	}
	public static void main(String arg[])
	{
		quetion_13 sc=new quetion_13();
	}
}
