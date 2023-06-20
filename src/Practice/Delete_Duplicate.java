//Q5.Wap input an array and delete all duplicate element from array.
package Practice;
import java.util.*;
public class Delete_Duplicate {
	int i,j,v,c;
	Scanner sb=new Scanner(System.in);
	public int input(int a[],int b[])
	{
		System.out.println("Enter array Element ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sb.nextInt();
		}
		return 0;
		
	}
	public int freq(int a[],int b[])
	{
		v=-1;
		for(i=0;i<a.length;i++)
		{
			c=1;
			for(j=i+1;j<b.length;j++)
			{
				if(a[i]==a[j])
				{
					b[j]=v;
					c++;
				}
			}
			if(b[i]!=v)
				{
				b[i]=c;
				}
		}
		for(i=0;i<a.length;i++)
		{
			if(b[i]!=v)
			{
				System.out.println(a[i]+" "+b[i]);
			}
		}
		return 0;
		
	}
	public static void main(String arg[])
	{
		int a[]=new int[10];
		int b[]=new int [a.length];
		Delete_Duplicate sc=new Delete_Duplicate ();
		sc.input(a,b);
		sc.freq(a,b);
		
	}

}
