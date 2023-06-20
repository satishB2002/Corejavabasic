package Practice;

public class Anticlockwise {
	public static void main(String arg[])
	{
		int i,x;
		int a[]= {1,2,3,4,5};
		
		x=a[0];
		for(i=1;i<a.length;i++)
		{
			a[i-1]=a[i];
		}
		a[a.length-1]=x;
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
