package Constructor;
/*Q6.Wap print all even no between 1 to n and find the count.*/
public class quetion_6 {
	int i,n,c,rem;
	quetion_6()
	{
		c=0;
		for(i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" ");
				c++;
			}
			
		}
	System.out.println(c+"sss ");
	}
	public static void main(String arg[])
	{
		quetion_6 sc=new quetion_6();
	}
	
}
