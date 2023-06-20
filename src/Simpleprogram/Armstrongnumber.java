package Simpleprogram;

import java.util.Scanner;

public class Armstrongnumber 
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		  int t=n;
		 int sum=0;
		 int rem;
		 int c=0;
		 while(t!=0)
		 {
			 t=t/10;
			 c++;
		 }t=n;
			while(t!=0)	
			{
				rem=t%10;
				sum=sum+(int)Math.pow(rem, c);
				t=t/10;
			}
					if(sum==n)
					{
						System.out.println("Armstrong");
					}
					else
					{
						System.out.println("Not Armstrong");
					}
					}
			
		}
					
	


