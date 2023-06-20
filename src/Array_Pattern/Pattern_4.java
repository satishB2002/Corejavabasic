package Array_Pattern;

public class Pattern_4 {
	int i,j;
	Pattern_4()
	{
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				if(i==1||j==5||i==j)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}
public static void main(String arg[])
{
	Pattern_4 sc=new Pattern_4();
}
}
