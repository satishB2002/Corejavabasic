
package previouspractice26Dec;
import java.util.*;
public class Sum_of_pair {
	int i,j;
	int sum;
	Scanner sc=new Scanner(System.in);
	public void input(int a[])

	{
		System.out.println("Enter Array ");
		for(i=0;i<a.length;i++)
		{
		a[i]=sc.nextInt();
		}
		System.out.println("Enter Your Sum ");
		sum=sc.nextInt();
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==sum)
				{
					
					System.out.println("Sum of pair=="+a[i]+" "+a[j]+" ");
				}
			}
		}
		
		
	}
	public static void main(String arg[])
	{
		int a[]=new int[10];
	
		 Sum_of_pair ob=new  Sum_of_pair();
		 ob.input(a);
		 
		 
	}

}
