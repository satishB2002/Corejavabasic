package Constructor;

public class parametricconstructor {
	int i;
	parametricconstructor()
	{
		System.out.println("the array of they");
	
	int a[]= {1,2,3,4,5,6,7,8,9};
	for(i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		System.out.println(a[i]+" ");
	}
	}
		
	public static void main(String arg[])
	{
		parametricconstructor sc=new parametricconstructor();
		
	}
}
