package Practice;

public class Frequency {
public static void main(String arg[])
{
	int i,j,v,c;
	v=-1;
	int a[]= {1,2,4,4,5,6,6,7,8,9};
	int b[]=new int[a.length];
	for(i=0;i<a.length;i++)
	{c=1;
		for(j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				b[j]=v;
				c++;
			}	
		}
		
	if(b[i]!=v)
	{
		b[i]=c;
	}
}
	
	for(i=0;i<a.length;i++)
	{
		if(b[i]!=v)
		{
			
			System.out.println(a[i]+" "+b[i]);
		}
	}
	
	
}

}
