package Practice;

public class nonrepeted {
	
	nonrepeted()
	{
		int a[]= {1,2,3,4,5,6,7,1,2,3};
		int i,j,c=0;
		for(i=0;i<a.length;i++)
		{
			c=0;
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
				}
			}
			if(c==0)
			{
			   System.out.println(a[i]);
			   break;
			   
			}
		}
	}
	public static void main(String[] args) {
		nonrepeted ok=new nonrepeted();
	}

}
