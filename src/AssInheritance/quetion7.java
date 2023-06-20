/*Q7.Wap to input an array and find the 2nd max element using constructor.*/
package AssInheritance;
import java.util.*;

class rename
{
	int i,j,t;
	int a[]=new int [5];
	Scanner sc=new Scanner(System.in);
			rename()
	{
		System.out.println("Enter array element");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
}


class name extends rename
{
	public void second()
	{
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		
	}
}

class then extends name
{
	public void describe()
	{
			
		for(i=0;i<a.length;i++)
		{
			
			System.out.println(a[i]+" ");
		}
		System.out.print(" Second Max=="+a[1]);
	}
	
}
public class quetion7 {
	public static void main(String ar[])
	{
		then sb=new then();
		sb.second();
		sb.describe();
	}

}
