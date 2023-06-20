//Q4.WAP to check if the matrix is symmetric or not.

package MixArraypattern_20_22;
import java.util.*;
public class Sparce_Matrix_Or_not {
	int i,j,row,col,c,size;
	int a[][]= {{0,2,3},
			{4,0,7},
			{0,0,9},
			};
	public static void main(String arg[])
	{
		Sparce_Matrix_Or_not  sc=new Sparce_Matrix_Or_not ();
		sc.input();
	}
	
	public void input(){
		row=a.length;
		col=a[0].length;
		size=row+col;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
		
			System.out.print(a[i][j]+"  ");
		}
			System.out.println();
	  }
		
		c=0;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				if(a[i][j]==0)
					c++;
			}
		}
		if(c>(size/2))
		
			System.out.println("Matrix is Sparce ");
		
			else
			
			System.out.println("Matrix Not Sparce");
		
	}
}
