package Constructor;
/*Q4.WAP tt enter a no and check it is pelindrome or not?*/
import java.util.*;
public class quqtion_4 {
	int n,t,rem,rev=0;
	quqtion_4()
	{
		n=121;
		t=n;
		while(t!=0)
		{
			rem=t%10;
			rev=rev*10+rem;
			t=t/10;
		}
		if(rev==n)
			System.out.println(n+"=Prime number");
		else
			System.out.println(n+"=Not prime");
	}
	public static void main(String arg[])
	{
	quqtion_4 sc=new quqtion_4();
	}
}
