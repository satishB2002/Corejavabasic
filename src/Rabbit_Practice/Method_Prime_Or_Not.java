package Rabbit_Practice;

import java.util.Scanner;

import Accessmadifier.publicmodifier;
import String.intern_method;

public class Method_Prime_Or_Not {
	public boolean getprime(Integer n)
	{
		int	t=n;
		int c=0;
		while(t!=0) {
			if(t%2==0) 
				c++;	
		}
		if (c==2) {
			return true;	
		}
		else {
			return false;
		}
		
	}
public static void main(String[] args) {
	Scanner sc	=new Scanner(System.in);
	System.out.println("Enter Your Number");
	Integer n	=sc.nextInt();
	 Method_Prime_Or_Not ss=new  Method_Prime_Or_Not();
	if(ss.getprime(n))
	{
		System.out.println("Prime");
	}else {
		{
			System.out.println("Not Prime");
		}
	}
	
		
}
}
