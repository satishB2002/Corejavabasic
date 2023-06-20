package Practice;

import java.util.Scanner;

import String.intern_method;

public class palindromecheck {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the no");
		int n=ob.nextInt();
		int c=0,i=n;
		while(i!=0)
		{
			c++;
			i=i/10;
		}
		int a[]=new int[c];
		i=n;
		int rem,rev=0;
		
		while(i!=0)
		{
			rem=i%10;
			rev=rev*10+rem;
			i=i/10;
		}
		if(rev==n)
		{
			int k=n,j=0;
			  
		j=0;
		while(k!=0)
		{
			rem=k%10;
		
			
					a[j]=rem;
					
					
				
			 
					k=k/10;
					j++;
					
				}
			 
			
			for(j=0;j<a.length;j++)
				System.out.println(a[j]);
			
		}
		else {
			System.out.println("not palindrome");
		}
		
		}
	}


