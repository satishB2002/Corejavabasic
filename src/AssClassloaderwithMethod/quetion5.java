package AssClassloaderwithMethod;
/*Q6.Wap initialise a 3*3 matrix and check it is sparse matrix or not.*/
public class quetion5 {

	int i,j,c;
	int [][]a= {{1,2,3},{0,0,0},{0,0,0}};
	int row=a.length;
	int col=a[0].length;
	int size=row*col;
	
	
	public void display()
	{
      System.out.println("first matrix ");
		
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	quetion5 ()
	{
	 this.display();
	 c=0;
		for(i=0;i<row;i++)
		{
			 
			for(j=0;j<col;j++)
			{
				if(a[i][j]==0)
				{
					c++;
				}
			}
			
		}
		
		if(c>(size/2))
		{
			System.out.println("Sparse tree");
		}
		else
		{
			System.out.println("not spares tree");
		}
	}
	
		public static void main(String args[])
				{
			quetion5 sc=new quetion5 ();
			
				}
		
	} 
		
		
	

