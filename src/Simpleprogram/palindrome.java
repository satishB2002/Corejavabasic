package Simpleprogram;

public class palindrome 
{
	public static void main(String arg[])
	{
		int num=12141;
		int temp=num;
		int rem=0,rev=0;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		if(rev==num)
		{
			System.out.println(num+"   =It is Palindrome");
		}
		else
		{
			System.out.println(num+"   =It is Not Palindrome");
		}
	}

}
