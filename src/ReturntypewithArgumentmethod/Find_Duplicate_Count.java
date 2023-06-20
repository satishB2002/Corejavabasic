//Q6.Wap enter an array and find the duplicate element and also count of that
package ReturntypewithArgumentmethod;
import java.util.*;
public class Find_Duplicate_Count {
	int i,j,c;
	Scanner sc=new Scanner(System.in);
	public int input(int a[])
	{
		c=0;
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
					System.out.print(a[i]+" ");
					
				}
				
			}
		}
		System.out.println(" Count ="+c);
		
		return 0;
	}
	public static void main(String arg[])
	{
		int a[]= {1,3,1,4,5,6};
		
		Find_Duplicate_Count ss=new Find_Duplicate_Count();
		ss.input(a);
	}

}
