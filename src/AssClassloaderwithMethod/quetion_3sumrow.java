package AssClassloaderwithMethod;
/*Q3.Wap initialise a 3*3 matrix and find the sum of rows.*/
public class quetion_3sumrow {
	int i,j,sum;
	
	quetion_3sumrow()
	{
		int a[][]= {{1,2,3},{6,2,9},{3,5,8}};
		for(i=0;i<3;i++)
		{
				sum=0;
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
				sum=sum+a[i][j];
				
			}
			System.out.println("sum of row="+sum);
		}
		
		
	}
	public static void main(String arg[])
	{
		quetion_3sumrow sc=new quetion_3sumrow();
	}
}
