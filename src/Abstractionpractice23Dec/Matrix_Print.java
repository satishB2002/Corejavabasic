package Abstractionpractice23Dec;
import java.util.*;



abstract class LMN
{
	public abstract void Print();
}
public class Matrix_Print extends LMN {
	int i,j;
	int [][]a=new int[3][3];
Scanner sc=new Scanner(System.in);

public void Print() {
	System.out.println("Enter Matrix");
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a.length;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("Your Matrix");
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a.length;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
}
public static void main(String arg[])
		{
	Matrix_Print sc=new Matrix_Print();
	sc.Print() ;
		}
}
