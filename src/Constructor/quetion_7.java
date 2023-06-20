package Constructor;
/*Q7.Wap print all odd no between 1 to n and find the count.*/
public class quetion_7 {
	int i,c;
	quetion_7()
	{
			c=0;
		for(i=1;i< 100;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i+" ");
				c++;
			}
			
		}System.out.println(" Count "+c);
	}
	public static void main(String arg[])
	{
		quetion_7 sc=new quetion_7();
	}
}
