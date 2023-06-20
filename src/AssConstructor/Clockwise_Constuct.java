package AssConstructor;

public class Clockwise_Constuct {

	Clockwise_Constuct ()
	{
		int i,x;
		int a[]= {1,2,3,4,5};
		x=a[a.length-1];
		for(i=a.length-2;i>=0;i--)
		{
			a[i+1]=a[i];
			
		}
		a[0]=x;
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String arg[])
	{
		Clockwise_Constuct  sc=new  Clockwise_Constuct ();
	}
}
