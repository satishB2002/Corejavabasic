package interface_practce_ass;
import java.util.*;
public class NumberPattern implements Number_Pattern  {
	int i,j;

	@Override
	public void num_pattern1() {
		for(i=5;i>=1;i--)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
	}

	@Override
	public void num_pattern2()
	{int c=1;
		for(i=1;i<=5;i++)
		{
			 
			for(j=1;j<=i;j++)
			{
			 
				System.out.print(c+" ");
				c=c+1;
			}
			System.out.println();
		}
		
	}
		
	
	public static void main(String arg[])
	{
		NumberPattern ss=new NumberPattern();
		ss. num_pattern1();
		ss. num_pattern2();
	}

}
