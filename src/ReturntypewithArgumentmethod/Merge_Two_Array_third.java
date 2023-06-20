//Q12.Wap input two array and merge in third array.
package ReturntypewithArgumentmethod;

public class Merge_Two_Array_third {
	int i,j;
	public int merge(int a[],int b[],int c[])
	{
		for(i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
		}
		for(i=0;i<c.length;i++)
		{
			System.out.println(c[i]+" ");
		}
		return 0;
	}
	public static void main(String arg[])
	{
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,10,};
		int c[]=new int[a.length+b.length];
		Merge_Two_Array_third aa=new Merge_Two_Array_third();
		aa.merge(a,b,c);
	}

}
