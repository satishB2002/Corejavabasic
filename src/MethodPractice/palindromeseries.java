package MethodPractice;
import java.util.*;
public class palindromeseries {
public boolean Checkpalindrome(int i)
{

	int num=i;
	int rem=0,rev=0;
	while(i!=0)
	{
		rem=i%10;
		rev=rev*10+rem;
		i=i/10;
		
	}
	if(rev==num)
		return true;
	else
		return false;
}
public static void main(String arg[])
		{
	
palindromeseries sc=new palindromeseries();
	for(int i=1;i<100;i++)
	{
	if(sc. Checkpalindrome(i))
		System.out.println(i+" ");
	
	
	}
	}
}
		
