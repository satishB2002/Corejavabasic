package AssClassloaderwithMethod;
/*Q8.input two matrx and print subtract in third matrix.*/
public class quetion_8 {
	int row,col;
	quetion_8()
	{
		int i,j;
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				    };
		int b[][]= {
				{3,2,1},
				{2,5,6},
				{7,8,9}
				    };
		row=a.length;
		col=a[0].length; 
		int sub[][]=new int[row][col];
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				sub[i][j]=a[i][j]-b[i][j];
			}
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(sub[i][j]+" ");
			
			
		}
			System.out.println();
		}
	}
	public static void main(String arg[])
	{
		quetion_8 sc =new quetion_8();
	}
}
