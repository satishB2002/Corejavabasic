/*Q2.
 *  *
   **
  * *
 *  *
*****

 */
package mixpractice3jan.txt;

public class Pattern2 {
	public void input()
	{
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(j==5||i==5||i+j==6)
				System.out.print("*");
			else
				System.out.print(" ");

		}
		System.out.println();
	}
	}
	public static void main(String arg[])
	{
		Pattern2 ss=new Pattern2 ();
		ss.input();
	}
}
