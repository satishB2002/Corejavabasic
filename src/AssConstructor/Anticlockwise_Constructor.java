package AssConstructor;

public class Anticlockwise_Constructor {
	
	Anticlockwise_Constructor()
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
			System.out.println(a[i]+" ");
		}
	}

	public static void main(String arg[])
	{
		Anticlockwise_Constructor sc=new Anticlockwise_Constructor();
	}

}
