/*Q1.
*
**
* *
*  *
******/
package mixpractice3jan.txt;

public class Pattern3 {
	Pattern3 ()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
			if(i==5||j==1||j-i==0)	
				System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String arg[])
			{
		Pattern3 ss=new Pattern3();

			}
}
