package Matrix_Practice;
import java.util.*;
public class Sparce_Matrix {
	int i,j,c=0;
	int a[][]=new int[3][3];
	int row=a.length;
	int col=a[0].length;
	int size=row*col;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter Your Matrix");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
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
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				if(a[i][j]==0)
				c++;
			
				
			}
		}
		if(c>(size/2))
		{
			System.out.println("Matrix is Sparce");
		}
			else
			
			System.out.println("Matrix is Not  Sparce");

	}
public static void main(String[] args) {
	Sparce_Matrix ss=new Sparce_Matrix();
	ss.input();
}
}
