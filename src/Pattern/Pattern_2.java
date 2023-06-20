/*	1 *

	1 2 * *
	1 2 3 * * *
	1 2 3 4 * * * *
	1 2 3 4 5 * * * * **/
package Pattern;

public class Pattern_2 {
public static void main(String[] args) {
	int i,j;
	for(i=1;i<=5;i++)
	{
		for(j=0;j<i;j++)
		{
			System.out.print(i);
		}
		for(j=0;j<i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
