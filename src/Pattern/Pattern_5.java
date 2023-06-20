/*	1 # #
	$ 1 #
	$ $ 1*/
package Pattern;

public class Pattern_5 {
public static void main(String[] args) {
	int i,j;
	for(i=1;i<=3;i++)
	{
		for(j=i;j<=3;j++)
		{
			if(i==1)
			{
			System.out.print("$");
			}
			if (i==j) {
				System.out.print(1);
			}
			if (i==j) {
				System.out.print(1);
			}
		}
		

		System.out.println();
	}
}
}
