package Practice;

import String.intern_method;

public class Mock_2_Q { 
	public static void main(String[] args) {
		String s="guruprasadg";
		char a[]=s.toCharArray();
		int i,j,n=a.length,c=1;
		System.out.println("first repeating is");
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;i++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
					i=n;
					j=n;
				}
			}
		}
		System.out.println("first non repating is");
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
			if(c==1)
			{
				System.out.println(a[i]);
			break;
			}
		}}
		}
		
	
