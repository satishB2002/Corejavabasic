package NORETURNNOARGUMENT_exm;
import java.util.*;
public class palindrome_1_n {
	int i,j,k,n,t,rem,rev;
	palindrome_1_n ()
	{
		k=1;
		n=100;
		for(i=k;i<n;i++)
		{
			t=i;
			rev=0;
			while(t!=0)
			{
				rem=t%10;
				rev=rev*10+rem;
				t=t/10;
			}
			if(rev==i)
				System.out.println(rev+" ");
		}
		
	}
	public static void main(String arg[])
	{
		palindrome_1_n  ss=new palindrome_1_n ();
	}

}
