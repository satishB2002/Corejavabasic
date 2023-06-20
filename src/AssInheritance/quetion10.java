/*Q10.Wap enter an array and search any particular element and find the count.*/
package AssInheritance;
import java.util.*;

class part
{
	int i,c,j,k;
	int a[]=new int[5];
	Scanner sc=new Scanner(System.in);
		part()
	{
			System.out.println("Enter Array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
	}
}

class cular extends part
{
	public void them()
	{
		System.out.println("Search Your element ");
		j=sc.nextInt();
		c=0; k=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==j)
			{
			k=1;
			c++;
			}
		}
		
	
	if(k==1)
	{
		System.out.println("j Found");
		System.out.println(" "+c);
	}
		else
		{
			
			System.out.println("Not found");
		}
	}
}


public class quetion10 {
public static void main(String arg[])
{
	cular sc=new cular();
	sc.them();
}
}
