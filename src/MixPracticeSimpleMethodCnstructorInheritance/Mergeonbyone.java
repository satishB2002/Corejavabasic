/*Q12.a[]={10,20,30,40,50}
   b[]={1,2,3,4,5}
 
  output array=c[]={10,5,20,4,30,3,40,2,50,1}*/
package MixPracticeSimpleMethodCnstructorInheritance;

import AsswithargNoarg.Mergeonebyone;

public class Mergeonbyone {
	{
		int i,j,l,m;
		int a[]= {10,20,30,40,50};
		int b[]= {1,2,3,4,5};
		int c[]=new int[a.length+b.length];
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
		Mergeonbyone  sc=new Mergeonbyone ();
	}
}
