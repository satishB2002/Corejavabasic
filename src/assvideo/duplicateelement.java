package assvideo;

public class duplicateelement 
{
	public static void main(String arg[])
	{
		int []a= {1,2,5,6,7,5,996,7,7,7,7,8,8,8,8,78,1};
		int []b=new int [a.length];
	    int i,j;
	    int v=-1;
	for(i=0;i<a.length;i++)
	{
		for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				
				{
				if(a[j]!=v)
				b[j]=v;
				}
			}
	}
	for(i=0;i<b.length;i++)
	{
		if(b[i]!=v)
			System.out.println(a[i]+" ");
		}
		
			
		}
	}
		
	
