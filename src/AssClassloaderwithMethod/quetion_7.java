package AssClassloaderwithMethod;
/*Q7.Wap initialise two 3*3 matrix and find the multiplication in third matrix.*/
public class quetion_7 {
	quetion_7()
	{
		int a [][] ={
				{1,1,1  },
				{2,2,2},
				{3,3,3}
		};
int b [][] ={
				{1,2,3},
				{1,2,3},
				{1,2,3}
		};
int  [][]c=new int [3][3];
int i,j,k;
			System.out.println("Matrix a");
		for(i=0;i<a.length;i++)
			{
				
				for(j=0;j<a.length;j++)
					{
			System.out.print(a[i][j]+"   ");
					}
			System.out.println();
			}
			System.out.println("Matrix b");
			for(i=0;i<a.length;i++)
			{
				
				for(j=0;j<b.length;j++)
					{
			System.out.print(b[i][j]+"   ");
					}
			System.out.println();
			}
		System.out.println("Multpication of Matrix");
		
		for(i=0;i<a.length;i++)
			{
				for(j=0;j<a.length;j++)
				{
				c[i][j]=0;
				
				for(k=0;k<a.length;k++)
{
			
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
					}
					}
		               }
				for(i=0;i<a.length;i++)
				{
				for(j=0;j<a.length;j++)
			          System.out.print(c[i][j]+"  ");
			
			System.out.println();
        }
								
}
	
	public static void main(String arg[])
	{
		quetion_7 sc=new quetion_7();
	}
}
