package AssInheritance;
public class Clockwise_Anticlockwise 
{
	public static void main(String ar[])
	{
		D sc=new D ();
        sc.Anti();
        sc.clock();
	}
}
class C

	{
	public void clock()
	{
		int i,x;
		int a[]= {1,2,3,4,5};
		x=a[a.length-1];
		System.out.println("Clockwise");
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
	}
class D extends C
{
public void Anti()
{
	int i,x;
	int a[]= {1,2,3,4,5};
	x=a[0];
	System.out.println("Anti Clockwise");
	for(i=1;i<a.length;i++)
	{
		a[i-1]=a[i];
		
	}
	a[a.length-1]=x;
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]+" ");
	}
	
}
}
	
	
	

