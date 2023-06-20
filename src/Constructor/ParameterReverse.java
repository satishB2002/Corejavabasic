package Constructor;
import java.util.*;
/*Q1.Wap enter and print its reverse no.*/
public class ParameterReverse {
int i,n,t,rev=0;
Scanner sc =new Scanner(System.in);
	ParameterReverse()
	{
		System.out.println("Enter number");
		n=sc.nextInt();
		t=n;
		int rem;
		while(t!=0)
		{
			rem=t%10;
			rev=rev*10+rem;
			t=t/10;
		}
		
		{
			System.out.println(rev+" ");
			
		}
	}
	public static void main(String arg[])
	{
		ParameterReverse sc=new ParameterReverse();
	}
	
		
}
