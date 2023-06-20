package mixpractice3jan.txt;
import java.util.*;
public class Pattern_6 {
	int i,j;
	Pattern_6()
	{
		for(i=9;i>=1;i--)
		{
			for(j=i+1;j<=9;j++)
			{
				System.out.print(" ");
				
			}
			for(j=1;j<=i;j++)
			{
				if((i==1||j==1||i==9||i==j)&& i%2!=0)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}
	public static void main(String arg[])
	{
		Pattern_6 bb =new Pattern_6();
	}

}
