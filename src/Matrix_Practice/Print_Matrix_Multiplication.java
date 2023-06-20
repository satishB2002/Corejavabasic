package Matrix_Practice;
import java.util.*;
public class Print_Matrix_Multiplication {
	int i,j,k;
	int a[][]=new int[3][3];
	int b[][]=new int[3][3];
	int c[][]=new int[3][3];
	Scanner ll=new Scanner(System.in);
	public void abcd() {
		System.out.println("Enter First Matrix");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				a[i][j]=ll.nextInt();
			}
		}
		System.out.println("Enter Second Matrix");
		for(i=0;i<b.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				b[i][j]=ll.nextInt();
			}
		}
		
		
	}
	public void xyz() {
		System.out.println("Your  Matrix Multiplication");
		for(i=0;i<c.length;i++)
		{
			for(j=0;j<c.length;j++)
			{
				for(k=0;k<c.length;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}	
			}
		}
		for(i=0;i<c.length;i++)
		{
			for(j=0;j<c.length;j++)
			{
					System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Print_Matrix_Multiplication ss=new Print_Matrix_Multiplication();
		ss.abcd();
		ss.xyz();
		}
}
