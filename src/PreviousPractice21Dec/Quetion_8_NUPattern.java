/*Q8. Write a program to print the Floyd’s triangle?

1
2  3
4  5  6
7  8  9  10*/
package PreviousPractice21Dec;

public class Quetion_8_NUPattern {
	int i,j,c;
	Quetion_8_NUPattern()
	{
		c=1;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+c++);
			}
			System.out.println();
		}
		
	}
	public static void main(String arg[]) {
		Quetion_8_NUPattern sc=new Quetion_8_NUPattern();
	}
}
