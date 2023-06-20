package Practice;
import java.util.*;

import String.intern_method;
public class Prime_Series {
	int i,j,c;
	Prime_Series(int n,int k)
	{
		
		for(i=1;i<=n;i++)
		{
			
		    c=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				c++;
			}
			if(c==2)
				System.out.print(i+" ");
		}
		
		
	}
	public void input(int n)
	{
		
	}
	public static void main(String arg[])
			{
		Scanner sb=new Scanner(System.in);
		System.out.println("Enter Start Range");
		int k=sb.nextInt();
		System.out.println("Enter Last Range");
		int n=sb.nextInt();
		Prime_Series sc=new Prime_Series(n,k);
		sc.input(n);
			}
}
