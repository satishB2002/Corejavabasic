//Q3.
//*
//**
//* *
//*  *
//*****
package Array_Pattern;

public class Pattern_1 {
	int i,j;
	public void input()
	{
		
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)	
				{
				if(i==1||j==1||i+j==6)
					System.out.print("*");
					else
						System.out.print(" ");
		}
			System.out.println();
	}
}
			
	

public static void main(String arg[])
{
	Pattern_1 sc=new Pattern_1();
	sc.input();
}
}
