package Simpleprogram;

public class palindromes1 {
	public static void main(String arg[])
	{
		int k=1,t;
		int n=100;
		
		while(k<=n)
		{
			t=k;
		int rem,rev=0;
			while(t!=0)
			{
				rem=t%10;
				rev=rev*10+rem;
				t=t/10;
				
			}
			if(rev==k)
				System.out.println(k+" ");
			k++;
		}
	}

}
