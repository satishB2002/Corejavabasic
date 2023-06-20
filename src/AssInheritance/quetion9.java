/*Q9.WAP to replace all the 0’s with 1’s in your array. Your array is [26, 0, 67, 45, 0, 78, 
    54, 34, 10, 0, 34] */
package AssInheritance;
import java.util.*;
class creator
{
	int i,j;
	int a[]= {26,0,67,45,0,78,54,34,10,0,34};
	creator()
	{
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}

class normal extends creator
{
	public void domain()
	{
		for(i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				a[i]=1;
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}


public class quetion9 {
	public static void main(String arg[])
	{
		normal sb=new normal();
		sb.domain();
	}

}
