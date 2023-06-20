package Array_Pattern;

public class Pattern_27 {
	Pattern_27()
	{
		int i,j;
		for(i=1;i<=9;i++)
		{
			for(j=i+1;j<=9;j++)
				{
				System.out.print(" ");
				}
			for(j=1;j<=i;j++)
			{
				if((i==1||j==1||i==j)&& i%2!=0)
				System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
				}
			
		
	}
	public void disp()
	{
		int i,j;
		for(i=8;i>=1;i--)
		{
			for(j=i+1;j<=9;j++)
				{
				System.out.print(" ");
				}
			for(j=1;j<=i;j++)
			{
				if((i==1||j==1||i==j)&& i%2!=0)
				System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
				}
			
		
		
	}
		
public static void main(String arg[])
		{
			
		Pattern_27 sc=new Pattern_27();
		sc.disp();
		
	   }
}
