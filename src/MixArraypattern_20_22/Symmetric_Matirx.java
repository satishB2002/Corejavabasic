package MixArraypattern_20_22;
import java.util.*;
public class Symmetric_Matirx {
	int i,j;
	int a[][]=new int[3][3];
	Scanner sc=new Scanner(System.in);
	Symmetric_Matirx()
	{
		boolean c=true;
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
			
				System.out.print(a[i][j]+" ");
			
			System.out.println();
		}
		System.out.println("Transpose Matrix");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			
				System.out.print(a[j][i]+" ");
			
			System.out.println();
		}
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				if(a[i][j]!=a[j][i])
					c=false;
			}
		}
		if(c==true)
			System.out.println("Matrix is Symmetric");
		else
		System.out.println("Matrix is NOT Symmetric");
	}
	public static void main(String arg[])
	{
		Symmetric_Matirx ss =new Symmetric_Matirx();
	}
}
