/*Q1.
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5*/
package MixArraypattern_20_22;

public class Pattern_no_1 {
	int i,j;
	public static void main(String arg[])
	{
		Pattern_no_1 sc=new Pattern_no_1();
	}
	Pattern_no_1()
	{
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
}
