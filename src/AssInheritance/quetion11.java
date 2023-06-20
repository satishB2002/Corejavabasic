/*Q1.Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[].*/
package AssInheritance;
import java.util.*;

class x
{
	int i,j,c,t;
	int a[]=new int[10];
	Scanner sc=new Scanner(System.in);
	x()
	{
		System.out.println("Enter Array element");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
	
	}
}
class y extends x
{
	public void structure()
	{
		System.out.println("Search the occurance no");
		t=sc.nextInt();
		for(i=0;i<a.length;i++)
		{c=0;
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					if(a[i]==t)
					{
						System.out.print("Occurance Count Is="+t);
						
					}
					c++;
				}
			}
			
		}
		System.out.println(c);
		
	}
	
}

public class quetion11 {
public static void main(String arg[])
{
	y sb=new y();
	sb.structure();
}
}
