package Practice;
import java.util.*;
public class Array_Palindrome_Non_Palindrome {
	int t,i,k=0,rem,rev;
	int a[]= {1,2,3,4,5,10,12,24,64,111,22,23,33,44,55};
	int b[]=new int[a.length];
	int c[]=new int[a.length];
	public void input()
	{
		System.out.println("Given Array is");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Palindrome Element Array");
		for(int i=0;i<a.length;i++)
		{
	
			t=a[i];
				rev=0;
				while(t!=0)
				{
					rem=t%10;
					rev=rev*10+rem;
					t=t/10;
					
				}
				if(rev==a[i])
				{	
					
					b[i]=a[i];
					
					System.out.println(b[i]+" ");
					
				}
				
		}
		
		
		}
		
	
	public void disp()
	{
		
		System.out.println("Non Palindrome Element Array");
		for(int i=0;i<a.length;i++)
		{
	
			t=a[i];
				rev=0;
				while(t!=0)
				{
					rem=t%10;
					rev=rev*10+rem;
					t=t/10;
					
				}
				if(rev!=a[i])
				{	
					c[i]=a[i];
					
					System.out.println(c[i]+" ");
				}
				
		}
		
			
	}
	public static void main(String arg[])
	{
		Array_Palindrome_Non_Palindrome ss=new Array_Palindrome_Non_Palindrome();
		ss.input();
		ss.disp();
	}

}
