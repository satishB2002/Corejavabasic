package Returntype;
import java.util.*;
public class Palindromeboolean {
	int n;
	int t;
	int rem;
	int rev=0;
	Scanner sc=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter no");
		n=sc.nextInt();
	}
	public boolean Checkpalindrme()
	{
		t=n;
		while(t!=0)
		{
			rem=t%10;
			rev=rev*10+rem;
			t=t/10;
		}
		if(rev==n)
			return true;
		else
			return false;
		
	}
	public static void main(String arg[])
	{
		Palindromeboolean sc=new Palindromeboolean();
		sc.input();
		boolean x=sc.Checkpalindrme();
		System.out.println(" "+x);
		
	}
}
