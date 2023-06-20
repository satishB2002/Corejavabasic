package AssClassloaderwithMethod;
/*Q4.Wap initialise a 3*3 matrix and find the sum of columns.*/


public class quetion_4 {
	int i,j,sum;
	quetion_4()
	{
		int a[][]= {{1,2,3},{6,2,9},{3,5,8}};
		for(i=0;i<3;i++)
		{
				sum=0;
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
				sum=sum+a[j][i];
				
			}
			System.out.println("sum of col="+sum);
		}
		
		
		
	}
	public static  void main(String arg[])
	{
		quetion_4 sc=new quetion_4();
	}
}
