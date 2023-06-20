package Matrix_Practice;
import java.util.*;
public class Print_Two_Matrix {
	int i,j;
	Scanner sc=new Scanner(System.in);
	public  void input(int a[][],int b[][])
	{
		System.out.println("Enter Your First Matrix");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Your Second Matrix");
		for(i=0;i<b.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
	}
	public  void disp(int a[][],int b[][])
	{
		System.out.println("Your First Matrix");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(" Your Second Matrix");
		for(i=0;i<b.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		Print_Two_Matrix  ss=new Print_Two_Matrix ();
		ss.input(a,b);
		ss.disp(a,b);
	}

}
