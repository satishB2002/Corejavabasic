//Q2.
 //    *
 //   **
 //  * *
 // *  *
 //*****
package Array_Pattern;

public class Pattern_2 
{
	int i,j;
	
	public void input1()
	{
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				if(i==5||j==5||i+j==6)
				
					System.out.print(" *");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
		}
		

public static void main(String arg[])
{
	Pattern_2 sc=new Pattern_2();
	sc.input1();
}
}
