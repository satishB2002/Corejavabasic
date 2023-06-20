package Matrix_Practice;
import java.util.*;
public class Two_Matrix_Addition {
	int i,j;
	int sum=0;
	int a[][]=new int[3][3];
	int b[][]=new int[3][3];
	int c[][]=new int[3][3];
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		
		System.out.println("Enter Your First Array");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Your First Array");
		for(i=0;i<b.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
	}
	public void addition()
	{
		
		System.out.println(" Your Matrix addition is");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
			c[i][j]=a[i][j]+b[i][j];
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
	Two_Matrix_Addition ss=new Two_Matrix_Addition();
	ss.input();
	ss.addition();
}
}
