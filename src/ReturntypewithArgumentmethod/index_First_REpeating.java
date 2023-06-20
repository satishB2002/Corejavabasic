package ReturntypewithArgumentmethod;

public class index_First_REpeating {
	int i,j;
	public int input(int a[])
	{
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					
				}
			}
		}
		
		return 0;
	}
	public static void main(String arg[])
	{
		int a[]= {1,2,3,4,2,5};
		index_First_REpeating aa=new index_First_REpeating();
		aa.input(a);
	}

}
