package RETURNWITHARGUMENT;

//Q10.Wap input a no and print table till that no;

import java.util.Scanner;
public class table {
	
	Scanner sc=new Scanner(System.in);
	
	public int disp(int n)
	{
		int i,j;
		
		for(i=1;i<=n;i++)
		{
									
					for(j=1;j<=n;j++)
					{
					System.out.print(i*j+"  ");
	                               }
			System.out.println();
	}	
		return 0;
	}
		
	
	
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		
		table ss=new table();
		
		ss.disp(n);
	}
	

}

