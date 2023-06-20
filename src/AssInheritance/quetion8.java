/*Q8.Wap to input an array and find the 2nd min element using constructor.*/
package AssInheritance;
import java.util.*;


class rename1
{
	int i,j,t;
	int a[]=new int [5];
	Scanner sc=new Scanner(System.in);
			rename1()
	{
		System.out.println("Enter array element");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
}


class name1 extends rename1
{
	public void second()
	{
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("Second minimum"+a[1]);
	}
}

class then1 extends name1
{
	public void describe()
	{
			
		for(i=0;i<a.length;i++)
		{
			
			System.out.println(a[i]+" ");
		}
		
	}
	
}
public class quetion8 {
public static void main(String arg[])
{
	then sb=new then ();
	sb.describe();
	sb.second();
}
}
