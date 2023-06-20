package parameterass;
/*Q13.a[]={10,20,30,40,50}
b[]={1,2,3,4,5}

output array=c[]={10,5,20,4,30,3,40,2,50,1}*/
import java.util.*;
public class Mergeonebyone {
	int i,l,m;
	Scanner sc=new Scanner(System.in);
	public void input(int a[],int b[],int c[])
	{
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		for(i=0;i<a.length;i++)
		{
			
			System.out.println(b[i]+" ");
		}
	}
	public void disp(int a[],int b[],int c[])
	{
			l=0;
		for(i=0;i<a.length;i++)
		{
			c[l]=a[i];
			l=l+2;
		}
		m=1;
		for(i=a.length-1;i>=0;i--)
		{
			c[m]=b[i];
			m=m+2;
		}
		for(i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		
	}
	public static void main(String arg[])
	{
		int a[]= {10,20,30,40,50};
		int b[]= {1,2,3,4,5};
		int size=a.length+b.length;
		int c[]=new int[size];
		Mergeonebyone sc=new Mergeonebyone();
		sc.input(a,b,c);
		sc.disp(a,b,c);
	}

}
