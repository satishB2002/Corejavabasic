/*Q4..Find the duplicate from the elements Size of array will be 10; 
 input in constructor and final result through the method. */
package AssInheritance;
import java.util.*;
class duplicate
{
	int i,j;
	int a[]=new int[10];
	Scanner sc = new Scanner(System.in);
			duplicate()
	{
				System.out.println("Enter Arry");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
					
		}
	}
}

class fin extends duplicate
{
	public void find()
	{
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(" Duplicate element"+a[j]+" ");
				}
			}
		}System.out.println();
	}
}

public class quetion4 {
	public static void main(String arg[])
	{
		fin sb=new fin();
		sb.find();
	}

}
