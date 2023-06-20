package Practice;

public class Odd_max {
	int i,j,t;
	Odd_max(int a[])
	{
		for(i=0;i<a.length;i++)
		{
		for(j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
		}
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				{
				
				
		System.out.println(" Max is="+a[i]);
					break;
				}
			
		}
		
		}
	
	public static void main(String arg[])
	{
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		Odd_max ss=new Odd_max(a);
		
		
	}

}
