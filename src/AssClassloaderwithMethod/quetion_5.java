package AssClassloaderwithMethod;
/*Q5.Wap initialise a 3*3 matrix and find the element present at odd position*/
public class quetion_5 {
	int i,j;
	quetion_5 ()
	{
		int a[][]= {{1,2,3},{6,2,9},{3,5,8}};
		for(i=0;i<3;i++)
		{
				
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
				
				
			}
			System.out.println();
		}
		
		
	}
	public static void main(String arg[])
	{
		quetion_5  sc=new quetion_5 ();
	}
}
