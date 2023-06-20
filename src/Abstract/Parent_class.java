package Abstract;
abstract class result {
public abstract void prime();
public abstract void  palin();
}
public  class  Parent_class extends result
{
	@Override
	public void prime() {
		int num=14;
		int temp=0;
		for(int i=2;i<num-1;i++)
		{
			if(num%i==0)
			temp=num+1;
		}
		if(temp==0)
		{
		System.out.println(num+"Prime");
		}
		else
		{
		System.out.println(num+"=not prime");
		}
	
	}	


	@Override
	public void palin() 
	{
		int temp;
		int n=153;
		temp=n;
		int rem;
		int rev=0;
		           while(temp!=0)
					{
							rem=temp%10;
							rev=rev*10+rem;
							temp=temp/10;
					}
				   
					if(rev==n)
					{
					System.out.println("Palindrome ");
					}
					else
					{
					System.out.println("Not palindrome");

					}
					}
					public static void main(String arg[])
					{
						
						Parent_class so=new Parent_class();
						so.prime();
						so.palin();
					}

}