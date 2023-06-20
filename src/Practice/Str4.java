package Practice;

import java.util.Scanner;

public class Str4 {
	Scanner sc=new Scanner(System.in);
	Str4()
	{
		int a[][]=new int[3][3];
		
		int i,j;
		int row=a.length;
		int col=a[0].length;
		if(row==col)
		{
		System.out.println("enter  matrix elemet");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println(" matrix is");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int k=0;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(a[i][j]!=a[j][i])
				{
					k=1;
				}
			}
		}
		if(k==1)
			System.out.println("not symentric");
			
		else
			System.out.println("symentric ");
		}
		else
		{
			System.out.println("no symentric ");
		}
		
	}
	
	public static void main(String[] args) {
		Str4 ok=new Str4();
	}

}