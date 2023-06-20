/*Q9.1. Write a program to print the following triangle?
1
2  2
3  3  3
4  4  4  4
5  5  5  5  5*/
package PreviousPractice21Dec;

public class Quetion_9_NUPaattern {
	int i,j;
	Quetion_9_NUPaattern()
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
	public static void main(String arg[])
	{
		Quetion_9_NUPaattern  sc=new Quetion_9_NUPaattern ();
	}
}
