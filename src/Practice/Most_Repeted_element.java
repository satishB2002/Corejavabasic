package Practice;

public class Most_Repeted_element {
int  i,j,c
,freq=0,count=0;
int a[]= {1,3,2,3,2,2};
public void main()
{
	System.out.println("Most repeted element");
	for(i=0;i<a.length;i++)
	{
		c=0;
		for(j=0;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				c++;
			}
		}
		if(c>count)
		{
			count=c;
			freq=a[i];
		}
		
	}
	System.out.println(" "+freq);
}
public static void main(String arg[])
{
	 Most_Repeted_element  ss=new  Most_Repeted_element ();
	 ss.main();
}
}
