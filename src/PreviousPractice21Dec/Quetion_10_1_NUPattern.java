/*Q10. Write a program to print the following triangle?
1  2  3  4  5
1  2  3  4
1  2  3
1  2
1*/
package PreviousPractice21Dec;

public class Quetion_10_1_NUPattern {
	int i,j;
	Quetion_10_1_NUPattern()
	{
		for(i=5;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String arg[])
	{
		Quetion_10_1_NUPattern sc=new Quetion_10_1_NUPattern();
	}
}
