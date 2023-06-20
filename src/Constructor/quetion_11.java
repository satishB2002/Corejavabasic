package Constructor;
/*Q11.Take 10 integer inputs from user and store them in an array. Now, copy all the 
elements in an another array,finally print copied array but in reverse order.  
input in constructor and print final result through the method. */
import java.util.*;
public class quetion_11 {
	Scanner sc=new Scanner(System.in);

	int []a=new int[10];
	int b[]=new int[a.length];
	int i;
	
	quetion_11()
	{
		
		System.out.println("Enter Your Array 10 Integer ");
		
		for( i=1;i<a.length;i++)
		{
		  a[i]=sc.nextInt();
		}
	}
		public void disp()
		{
			for(i=a.length-1;i>0;i--)
			{
				b[i]=a[i];
			}
			for(i=a.length-1;i>0;i--)
			{
			System.out.print(b[i]+" ");
			}
		}
		
	public static void main(String arg[])
	{
		quetion_11 sc=new quetion_11();
		sc.disp();
	}
	
		
	}


