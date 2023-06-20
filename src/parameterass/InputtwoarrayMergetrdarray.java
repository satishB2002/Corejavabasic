package parameterass;
/*Q12.Wap input two array and merge in third array.
*/
import java.util.*;
public class InputtwoarrayMergetrdarray {
	int i;
	Scanner sc=new Scanner(System.in);
	public void input(int a[],int b[],int c[])
	{
		System.out.println("Enter 1st Array element");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter 2nd Array element");
		for(i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
		}
		for(i=0;i<a.length+b.length;i++)
		{
			System.out.println(c[i]+" ");
		}
		
	}
	public void disp(int a[],int b[],int c[])
	{
		
	}
	public static  void main (String arg[])
	{
		int a[]=new int[5];
		int b[]=new int[5];
		int size=a.length+b.length;
		int c[]=new int [size];
		InputtwoarrayMergetrdarray sc=new InputtwoarrayMergetrdarray();
		sc.input(a, b, c);
		sc.disp(a, b, c);
	}

}
