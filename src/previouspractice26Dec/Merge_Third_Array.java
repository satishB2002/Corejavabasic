//Q9.Wap input two array and merge in third array.
package previouspractice26Dec;
import java.util.*;
public class Merge_Third_Array {
	int i,j;
	Scanner sc=new Scanner(System.in);
	public int  input(int a[],int b[],int c[])
	{
		System.out.println("Enter First Array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter Second  Array");
		for(i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		return 0;
		
		
	}
	public int  disp(int a[],int b[],int c[])
	{
		for(i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
		}
		System.out.println("Third Array");
		for(i=0;i<c.length;i++)
		{
			System.out.println(c[i]+" ");
		}
		return 0;
	}
	public static void main(String arg[])
	{
		int a[]=new int[5];
		int b[]=new int[5];
		int size=a.length+b.length;
		int c[]=new int[size];
		Merge_Third_Array ss=new Merge_Third_Array();
		ss.input(a,b,c);
		ss.disp(a,b,c);
	}

}
