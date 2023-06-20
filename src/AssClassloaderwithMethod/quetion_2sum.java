package AssClassloaderwithMethod;

public class quetion_2sum {
	int row,col;
	quetion_2sum()
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
		int sum[][]=new int[row][col];
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(sum[i][j]+" ");
			
			
		}
			System.out.println();
		}
		}
		
	
		public static void main(String arg[])
		{
			quetion_2sum sc=new quetion_2sum();
		}
		
		
	}

