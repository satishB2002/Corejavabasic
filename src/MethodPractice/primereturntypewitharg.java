package MethodPractice;

import java.util.Scanner;

public class primereturntypewitharg {
	int temp;

public boolean Checkprime(int n)
{
 temp=0;
 
	for(int i=2;i<n-1;i++)
		{
			if(n%i==0)
			temp=n+1;
		}
		if(temp==0)
			return true;
		else
			return false;
			
		
			
}
public static void main(String arg[])
		{
	Scanner sb=new Scanner(System.in);
	primereturntypewitharg sc=new primereturntypewitharg();
	/*int n,temp;
	
	System.out.println("Enter number");
	 n=sb.nextInt();
	System.out.println(sc.Checkprime(n));*/
	for(int i=1;i<100;i++)
	{
	if(sc.Checkprime(5))
		System.out.println(i+" ");
	
		
		}
		}
}
