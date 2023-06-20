package Practice;

import String.intern_method;

public class Alternative_Array
{
public static void main(String[] args)
{
	int j=-1,k=-1;
	int a[]= {9,5,-2,-3,10,11,-7,35,12};
	
	int p[]=new int[a.length];
	int n[]=new int[a.length];
	
	int i;
		for ( i = 0; i <a.length; i++)
		{
			if (a[i]<0) 
			{
				n[++j]=a[i];
			}
			
				else 
				{
				
					p[++k]=a[i];
				
				}
				
				
			}

		System.out.println("GVHG VGHJGK");
		if(j>=0)
		{
			for ( i = 0; i <=j; i++) {
				System.out.println(n[i]+" ");
			}
			System.out.println();
		
		}
		else
		{
			System.out.println("Values Not Present");
		}
			if(k>=0)
			{
				for ( i= 0; i <=j; i++) {
					System.out.println(p[i]+" ");
				}
				System.out.println();
				
			}
			else
			{
				System.out.println("Values Not Present");
			
	}
			int h[]=new int[p.length+n.length];
			int l=0,m=1;
			for (int m2 = 0; m2 < p.length; m2++) {
				h[l+1]=n[i];
				l=l+2;
			}
			for (int m2 = 0; m2 < n.length; m2++) {
				h[m]=p[i];
				m=m+2;
			}
			for (int m2 = 0; m2 < h.length; m2++) {
				
			
			System.out.println(h[i]+" ");
			}
}
}
