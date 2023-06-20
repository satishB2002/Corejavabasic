package HoloPattern;
/*        *  *  *  *  *
          *  *  *  *
          *  *  *
          *  *
          *                          */

public class HollowPattern {
	public static void main(String arg[])
	{
		int i,j;
		int n=5,m=5;
		for(i=1;i<=n;i++)
		{
			for(j=i;j<=m;j++)
			{
				if(i==1 || j==5 ||j==i )
				
					System.out.print(" *");
					else
				System.out.print("  ");	
				
			}
			System.out.println();
		}
	}

}
