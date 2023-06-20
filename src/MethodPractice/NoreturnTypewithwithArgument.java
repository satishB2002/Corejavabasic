package MethodPractice;
import java.util.*;
public class NoreturnTypewithwithArgument {
	int i,sum;
	public void input(int n)
	{
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
			
		}
		System.out.print(" Sum of number="+sum);
		System.out.println();
	}
	public static void main(String arg[])
	{
		NoreturnTypewithwithArgument sc=new NoreturnTypewithwithArgument();
		int n=100;
		sc.input(n);
	}

}
