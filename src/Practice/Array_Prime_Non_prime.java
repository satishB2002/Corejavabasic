package Practice;
import java.util.*;
public class Array_Prime_Non_prime {
		int t=0,i,j;
		int a[]= {2,3,4,5,6,7,8,9,10,11,12,13,14,15};
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
			System.out.println("Prime Element Array");
			for( i=0;i<a.length;i++)
			{
				for( j=2;j<=i;j++)
				{
					if(a[i]%j==0)
						break;
				}
					if(a[i]==j)
					{	
						b[i]=a[i];
						
						System.out.println(b[i]+" ");
					}
			}
			}
		public void disp()
		{
			
			System.out.println("Non Prime Element Array");
			
			
			for(int i=0;i<a.length;i++)
			{
				for( j=2;j<i-1;j++)
				{
					if(a[i]%j==0)
						t=a[i]+1;
				}
					if(t!=0 ||t!=a[i])
					{	
						c[i]=a[i];
						
						System.out.println(c[i]+" ");
					}
			}
				
		}
		public static void main(String arg[])
		{
			Array_Prime_Non_prime ss=new Array_Prime_Non_prime();
			ss.input();
			ss.disp();
		}

	}

