//Q2.Write a Java program to separate even and odd numbers of a given array of integers. Put all even numbers first, and then odd numbers
package Static_Example;
import java.util.*;
public class Array_Even_Odd {
	static int i,j,even,odd;
	static int a[]=new int[10];
	static
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Even numbers of  Array");
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]+" ");
			}
		}
		System.out.println("Odd numbers of  Array");
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]+" ");
			}
		}
	}
	public static void main(String arg[])
	{
		
	
	Array_Even_Odd sc=new Array_Even_Odd();
	
	}
}
