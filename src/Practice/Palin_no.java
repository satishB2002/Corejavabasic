package Practice;
import java.util.*;
public class Palin_no {
	public static void main(String arg[])
	{
		int i,t,rem,rev,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		n=sc.nextInt();
		t=n;
		rev=0;
		while(t!=0)
		{
			rem=t%10;
			rev=rev*10+rem;
			t=t/10;
			
		}
		if(rev==n)
		{
			System.out.println("Palindrome");
		}
			else
			System.out.println("Not Palindrome");
		}
		
	


}
