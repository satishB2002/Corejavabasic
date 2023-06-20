/*Q3.Find the majority element in the array. A majority element in an array A[] of size n is an element 
   that appears more than n/2 times (and hence there is at most one such element).*/
package previouspractice26Dec;
import java.util.*;
public class quetion2 {
	int i,j,v=-1,c;
	int a[]=new int[8];
	int b[]=new int[a.length];
	
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter Array Element");
		int n=a.length/2;
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<a.length;i++)
		{
			c=1;
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					b[j]=v;
					c++;
					
				}
			}
			if(b[i]!=v)
			{
				b[i]=c;
			}
		}
		for(i=0;i<a.length;i++)
		{
			if(b[i]>n)
			{
				System.out.println("Majority Element"+a[i]);
				break;
			}
		}
		
	}
	public static void main(String arg[])
	{
		quetion2  ss=new quetion2 ();
		ss. input();
		}
}
