/*Q9. Write a program to print the following triangle?
1
1  2
1  2  3
1  2  3  4
1  2  3  4  5*/
package PreviousPractice21Dec;

public class Quetion_9_2_NUPattern {
	int i,j;
	 Quetion_9_2_NUPattern ()
	{
		for(i=1;i<=5;i++)
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
		 Quetion_9_2_NUPattern sc=new  Quetion_9_2_NUPattern ();
	 }
}
