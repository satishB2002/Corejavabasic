//Q7.Wap input 5 digit integer and find the sum of even and odd no .
package NORETURNNOARGUMENT_exm;
import java.util.*;
public class reverse_sum_even_odd {
	int i,n,sum2=0,sum=0,even=0,odd=0,rem,c=0;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter Yout digit");
		n=sc.nextInt();

	}
	public void disp()
	{
		 i=n;
		int j;
		while(i!=0)
		{
			rem=i%10;
			
			
			if(rem%2==0)
			{
				
				c++;
				sum2=sum2+rem;
			}
			if(rem%2!=0)
			{
				
				sum=sum+rem;
			}
			
			i=i/10;
		}
		System.out.println("sum of even numbers="+sum2);
		System.out.println("sum of odd nummbers="+sum);
		
	}
	public static void main(String arg[])
	{
		reverse_sum_even_odd ss=new reverse_sum_even_odd();
		ss.input();
		ss.disp();
		
	}
	

}
