package Constructor;
/*Q9.Wap print all prime no between 1 to 100.*/
public class quetion_9 {
	int i,n,j,c;
	quetion_9()
	{
		for(i=1;i<=100;i++)
		{
			n=i;
			j=2;
			c=0;
			while(j<n)
			{
				if(n%j==0)
				{
					c++;
				}
				j++;
			
			
		}
		if(c==0)
		{
		System.out.println(i+" ");
		}
	}
	}
	public static void main(String arg[])
	{
		quetion_9 sc=new quetion_9();
	}
}
	

