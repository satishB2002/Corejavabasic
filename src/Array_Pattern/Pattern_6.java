package Array_Pattern;

public class Pattern_6 {
	public static void main(String arg[])
	{
		int i,j;
		for(i=9;i>=1;i--)
		{
			for(j=i;j<=9;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				if((j==1||i==9||j==i) && i%2!=0)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
