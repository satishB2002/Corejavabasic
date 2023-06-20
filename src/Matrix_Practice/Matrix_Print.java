package Matrix_Practice;
import java.util.*;
public class Matrix_Print {
	Scanner sc=new Scanner(System.in);
	public void input(int a[][])
	{
		int i,j;
		System.out.println("Enter Your Matrix");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				
			
		a[i][j]	=sc.nextInt();
			}
		}
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				
			
		System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		int a[][]=new int[3][3];
		Matrix_Print ss=new Matrix_Print();
		ss.input(a);
	}

}
