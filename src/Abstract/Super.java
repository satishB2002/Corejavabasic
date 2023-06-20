package Abstract;
abstract class vehicle 
{
	public abstract void input();
	public abstract void disp();
	public abstract void res();
}
public  class Super extends vehicle
{
	
	public void input() {
		System.out.println("PALINDROME SERIES");
		int i,j,rem,rev,t;
		int k=1;
		int n=100;
		for(i=k;i<n;i++)
		{
			rev=0;
			t=i;
			while(t!=0)
			{
				rem=t%10;
				rev=rev*10+rem;
				t=t/10;
			}
			if(rev==i)
				System.out.println(i+" ");
		}
		
	}

	
	public void disp() {
		System.out.println("PRIME SERIES");
    int i,j,t,k,n;
    k=1;
    n=100;
   
    for(i=k;i<=n;i++) 
    {
    	 t=0;
    	for(j=2;j<i-1;j++)
    	{
    		if(i%j==0)
    			t=n+1;
    	}
    	if(t==0)
    	
    		System.out.println(i+" ");
    	
    }
		
	}
	public void res() {
		System.out.println("Armstrong  SERIES");
		int i,j,sum,rem,t;
		int k=1;
		int n=1000;
		for(i=k;i<=n;i++)
		{
			t=i;
			sum=0;
			while(t>0)
			{
				rem=t%10;
				sum=sum+(rem*rem*rem);
				t=t/10;
			}
			if(sum==i)
			{
				System.out.println(i+" ");
			}
		}
		
	}
	
public static void main(String arg[])
			{
	//	vehicle  sc=new vehicle ();
		Super sd =new Super ();
		sd.input();
		sd.disp();
		sd.res();
			}

	
	
	
}
