/*	1 
	1 4 
	1 8 27 
	1 16 81 256
	*/
package Pattern;

import Exception.Nested_Try_catch;

public class Pattern_6 {
public static void main(String[] args) {
	int i,j;
	for(i=1;i<5;i++)
	{
		
		for(j=1;j<=i;j++)
		{
			System.out.print(" "+(int)Math.pow(j, i));
		}
		System.out.println();
	}
	
}
}
