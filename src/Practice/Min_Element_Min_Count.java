package Practice;
import java.util.*;

public class Min_Element_Min_Count {
	int i,j,v=-1,c;
	int a[]=new int[10];
	int b[]=new int[a.length];
	Scanner sc= new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter Array Element");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		v=-1;
		
		for(i=0;i<a.length;i++)
		{
			c=1;
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					b[j]=v;
					c++;
				}
			}
			if(b[i]!=v)
			
				b[i]=c;
			
		}
		for(i=0;i<a.length;i++)
		{
			if(b[i]!=v)
			{
				System.out.println(a[i]+" "+b[i]);
			}
		}
		int c=0;
		int minCount=b[0],minElement=a[0];
		for(i=0;i<a.length;i++)
		{
			if(b[i]<minElement && b[i]>0)
				minElement=a[i];
			 minCount=b[i];
		}
		System.out.println("Minimum Element =="+minElement+" ");
		System.out.println(" Count Of Minimum Element=="+ minCount+" ");
		int maxCount=b[0],maxElement=a[0];
		for(i=0;i<a.length;i++)
		{
			if(b[i]>maxElement && b[0]<0)
				maxElement=a[i];
			 maxCount=b[i];
			 c++;
		}
		System.out.println("Maximum Element =="+maxElement+" ");
		System.out.println(" Count Of Maximum Element=="+ maxCount+" ");
	}
	public static void main(String arg[])
	{
		Min_Element_Min_Count ss=new Min_Element_Min_Count();
		ss.input();
	}

}
