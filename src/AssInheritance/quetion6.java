/*Q6.Wap replace 0's from the square of  the next element of array using constructor.
   your array is-{2,0,4,8,0,5,0,5,8};*/
package AssInheritance;
import java.util.*;
class zeros
{
	int i;
	int a[]=new int[10];
	Scanner sc=new Scanner(System.in);
	zeros()
	{
		System.out.println("Enter Element");
		for(i=0;i<a.length;i++)
		{
		a[i]=sc.nextInt();
		}
	}
}

class square extends zeros
{
	public void next()
	{
		for(i=0;i<a.length;i++)
		{
			if(a[i]==0)
				{
					a[i]=a[i+1]*a[i+1];
				
					}
		}
		
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		}
	}

public class quetion6 {
public static void main(String arg[])
{
	square sb=new square();
	sb.next();
}
}
