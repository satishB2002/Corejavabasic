//Q8.Wap print all prime no between 1 to n;
package RETURNWITHARGUMENT;
import java.util.*;
public class prime_1_n {
	int i,j,temp,k,n;
	Scanner sb=new Scanner(System.in);
	
public int  input()
	{
		k=1;
		n=100;
		
		for(i=k;i<=n;i++)
		{
			temp=0;
			for(j=2;j<i-1;j++)
			{
				if(i%j==0)
				temp=n+1;
			}
			if(temp==0)
				System.out.println(i+" ");
		}
		
		return 0;
	}
	
	public static void main(String arg[])
			{
		
		prime_1_n  sc=new prime_1_n();
		sc.input();
		
			}
}
