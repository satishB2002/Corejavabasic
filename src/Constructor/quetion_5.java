package Constructor;
/*Q5.Wap print all pelindrome no between 10 to 200.*/
import java.util.*;
public class quetion_5 {
	int k,i,n,t,rem,rev=0;
	Scanner sc=new Scanner(System.in);
	quetion_5()
	{int k=10,t;
	int n=200;
	
	//int rem,rev=0;
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
	public static void main(String arg[])
	{
		quetion_5 sc=new quetion_5();
	}

}
