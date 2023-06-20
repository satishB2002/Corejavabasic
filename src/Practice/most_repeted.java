package Practice;

public class most_repeted {
	int i,j,c=0,count=0,t=0;
	int a[]= {1,2,3,1,2,4,5,1,6,7,8,9};
	public void input()
	{
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		for(i=0;i<a.length;i++)
		{
			c=0;
			for(j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>c)
			{
				c=count;
				t=a[i];
			}
		}
		System.out.println("Most repeted element=="+t);
	}
	public static void main(String arg[])
	{
		most_repeted ss=new most_repeted();
		ss.input();
	}

}
