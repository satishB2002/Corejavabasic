package RETURNWITHARGUMENT;

//Q7.Wap input 5 digit integer and find the sum of even and odd no .

import java.util.*;
public class reverse_sum_even_odd {
	int i,sum2=0,sum=0,even=0,odd=0,rem,c=0;
	Scanner sc=new Scanner(System.in);
	
	public int disp(int n)
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
		return 0;
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Yout digit");
	int 	n=sc.nextInt();
		reverse_sum_even_odd ss=new reverse_sum_even_odd();
		
		ss.disp(n);
		
	}
	

}
