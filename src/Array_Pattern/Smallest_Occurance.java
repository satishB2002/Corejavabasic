package Array_Pattern;
import java.util.*;
public class Smallest_Occurance {
	int i,j,n;
	int a[]=new int[10];
	Scanner sb=new Scanner(System.in);
	public void input()
	{System.out.println("Enter array element");
	
		for(i=0;i<a.length;i++)
		{
			a[i]=sb.nextInt();
		}
			
			
		n=a.length;
		for(i=0;i<a.length;i++)
		{
			
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(" index="+i);
					i=n;
					j=n;
				}
				}
			
		}
		
	}
public static void main(String arg[])
{
	Smallest_Occurance sc=new Smallest_Occurance();
	
	sc.input();
}
}
