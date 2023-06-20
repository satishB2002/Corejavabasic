/*Q4.
 *****
  *  *
   * *
    **
     */

package mixpractice3jan.txt;

public class Pattern4 {
	Pattern4()
			{
	for(int i=1;i<=5;i++)
	{
		for (int j=1;j<=5;j++)
		{
			if(i==1||j==5||i-j==1)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
					}

			}
	public static void main(String arg[])
	{
		Pattern4 ss=new Pattern4();
	}
}
