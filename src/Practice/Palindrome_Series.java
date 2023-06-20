package Practice;
import java.util.*;

public class Palindrome_Series {
	int i,j,rem,rev,temp;
	Palindrome_Series (int k,int n)
	{
		
		for(i=k;i<=n;i++)
		{
			rev=0;
			temp=i;
			while(temp!=0)
			{
				rem=temp%10;
				rev=rev*10+rem;
				temp=temp/10;
			}
			if(rev==i)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
	}
	
	public static void main(String arg[])
	{
		Scanner sb=new Scanner(System.in);
		System.out.println("Enter start range");
		int k=sb.nextInt();
		System.out.println("Enter Last Range");
		int n=sb.nextInt();
		Palindrome_Series  sc=new Palindrome_Series (k, n);
		
		
	}
}
