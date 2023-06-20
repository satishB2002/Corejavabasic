/*
1
2*3
4*5*6
7*8*9*10
4*5*6
2*3
1
*/
package Pattern;

import java.util.Iterator;

public class Pattern_4 {
public static void main(String[] args) {
	int i,j;
for(i=1;i<=10;i++)
{
	for(j=1;j<i;j++)
	{
		System.out.print(j+" ");
	}
	
	System.out.println();
}


for(i=9;i>=1;i--)
{
	for(j=1;j<i;j++)
	{
		System.out.print(j+" ");
	}
	
	System.out.println();
}

System.out.println();
}


}
