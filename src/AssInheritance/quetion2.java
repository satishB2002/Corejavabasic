
/*Q2.An array contains both positive and negative numbers in random order. Rearrange the array elements so 
  that all negative numbers appear before all positive numbers.
   Examples : 

  Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
  Output: -12 -13 -5 -7 -3 -6 11 6 5*/

package AssInheritance;
import java.util.*;
class positive
{
	int a[]= {-12,11,-13,-5,6,-7,5,-3,-6};
	int i,j,t;
	
	positive()
	{
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>0)
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;				}
			}
		}
	}
}



class Negative extends positive
{
	public void appear()
	{
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}


public class quetion2 {
	public static void main(String arg[])
	{
		Negative sb=new Negative();
		sb.appear();
	}

}
