/*Q11.WAP to check if an array of integers contains two specified elements. */
package AssInheritance;
import java.util.*;
class check
{
	int i,j,k,m,t,c;
	int a[]=new int[10];
	Scanner sc=new Scanner(System.in);
	check()
	{
		System.out.println("Enter Array Element");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
}

class there extends check
{
	public void seco()
	{k=0;c=0;
	System.out.println("Enter Your 1st Element");
	j=sc.nextInt();
		for(i=0;i<a.length;i++)
		{
			if(a[i]==j)
			{
				k=1;
				c++;
				
			}
		}
		if(k==1)
		
			System.out.println("1St Element Found");
			else
		System.out.println("First is 1st is Not Found");
		
	}
}
class there1 extends there
{
	public void seco1()
	{m=0;c=0;
	System.out.println("Enter Your 2snd Element");
	t=sc.nextInt();
		for(i=0;i<a.length;i++)
		{
			if(a[i]==t)
			{
				m=1;
				c++;
				
			}
		}
		if(m==1)
		System.out.println("2nd Element Found");
		else
			System.out.println("Second is 2nd Not Found");
		}
	}


public class quetion11_10 {
public static void main(String arg[])
{
	there1 sc=new there1();
	sc.seco();
	sc.seco1();
}
}
