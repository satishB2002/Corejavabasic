package Practice;
import java.util.*;

import String.intern_method;
public class Prime_number {
	public static void main(String arg[])
	{
	int i,n,c;
	Scanner ss=new Scanner(System.in);
		System.out.println("Enter Number");
		n=ss.nextInt();
		
		
         c=0;
		for(i=1;i<=n;i++)		{
			if(n%i==0)
				c++;	}
		if(c==2)
		{
			System.out.println("Prime ");
		}
		else
			System.out.println("NOt prime ");
		
	}

}
