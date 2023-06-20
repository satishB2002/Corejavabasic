//Q11:Wap input two array and merge in third array.
package MixPracticeSimpleMethodCnstructorInheritance;
import java.util.*;
public class MergeArray {
	{
		int i,j;
		int a[]=new int[5];
		int b[]=new int[5];
		int size=a.length+b.length;
		int c[]=new int[size];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First arry");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter First arry");
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
		System.out.println("Third Array");
		for(i=0;i<c.length;i++)
		{
			System.out.println(c[i]+" ");
		}
	}
	public static void main(String arg[])
	{
		MergeArray sc=new MergeArray();
	}

}
