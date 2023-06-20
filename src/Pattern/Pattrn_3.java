/*	1
	1 2
	2 2 3
	3 3 3 4
	4 4 4 4 5
	5 5 5 5 5 6*/
package Pattern;

public class Pattrn_3 {
public static void main(String[] args) {
	int i,j;
	for(i=0;i<=5;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(i);
		}
		for(j=i+1;j<=i+1;j++)
		{
		System.out.print(j);
		}
		System.out.println();
	}
}
}
