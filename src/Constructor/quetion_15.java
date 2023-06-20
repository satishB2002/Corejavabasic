package Constructor;
/*Q15. How do you find the largest and smallest number in an unsorted integer array size 10. 
input in constructor and final result through the method. */
import java.util.*;
public class quetion_15 {
	int i,j,t;
	int a[]=new int[10];
	Scanner sc=new Scanner(System.in);
	quetion_15()
	{System.out.println("Enter Number");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	public void disp()
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
		for(i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}
		System.out.println("Largest no Is="+a[a.length-1]);
		System.out.println("Smallest no Is-"+a[0]);
	}
	public static void main(String arg[])
	{
		quetion_15 sc=new quetion_15();
		sc.disp();
	}
}
