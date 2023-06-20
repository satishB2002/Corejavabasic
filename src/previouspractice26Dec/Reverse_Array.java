//Q8.Wap enter an array and print it in reverse order.
package previouspractice26Dec;
import java.util.*;
public class Reverse_Array {
int i,j;
int a[]=new int [10];
Scanner sc=new Scanner(System.in);
public void input()
{
	System.out.println("Enter Array");
	for(i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Reverse Array");
	for(i=a.length-1;i>=0;i--)
	{
		System.out.println(a[i]+" ");
	}
}
public static void main(String arg[])
		{
	Reverse_Array ss=new Reverse_Array();
	ss.input();		}
}
