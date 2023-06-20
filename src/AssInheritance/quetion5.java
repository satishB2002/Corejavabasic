/*Q5. How do you find the largest and smallest number in an unsorted integer array size 10. 
 input in constructor and final result through the method. */
package AssInheritance;
import java.util.*;
class valid
{
	int i,j,t;
	int a[]=new int[10];
	Scanner sc=new Scanner(System.in);
	valid()
	{
		System.out.println("Enter Array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
}
class qualify extends valid
{
	int max=0;
	public void largest()
	{
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>=max)
				{
				max=a[i];		
				}
			}
		}
		System.out.println(" Largest ="+max);
		
	}
}
class smallest extends qualify
{
	
	public void smaller()
	{
		int min=a[0];
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<min)
				{
					min=a[i];	
				}
			}
		}
		System.out.println(" Smallest="+min);
	}
}

public class quetion5 {
	public static void main(String arg[])
	{
		smallest ss = new smallest();
		ss.largest();
		ss.smaller();
	}

}
