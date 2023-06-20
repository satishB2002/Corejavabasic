//Q3.Write a program to print Armstrong series between given range.
package PreviousPractice21Dec;
import java.util.*;
public class Armstrong_Series {
	int i,j,sum,t,k,n,c,rem;
	Scanner sc=new Scanner(System.in);
	Armstrong_Series()
	{
	System.out.println("Enter First Range");
	k=sc.nextInt();
	System.out.println("Enter Last Range");
	n=sc.nextInt();
	}
	public void disp()
	{
		
		c=0;
		for(i=k;i<=n;i++)
		{
	
			t=i;
			while(t > 0)
			{
				rem=t%10;
				sum=sum+(rem*rem*rem);
				t=t/10;
				
			}
			if(sum==i)
			{
				System.out.println(i+" ");
			}
			sum=0;
		}
		
	}
	public static void main(String arg[])
	{
		Armstrong_Series  sb=new Armstrong_Series ();
		sb.disp();
	}
}
