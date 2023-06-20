//Q1.Write a Java program to test the equality of two arrays.
package MixArraypattern_20_22;
import java.util.*;
public class Equeality_of_To_Array {
	int i,j,x,y;
	Scanner sc=new Scanner(System.in);
	Equeality_of_To_Array (int a[],int b[])
	{
		System.out.println("Enter First Array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter Second Array");
		for(i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
	}
	public void disp(int a[],int b[])
	{
		
		boolean c=true;
		
			if(a.length==b.length)
			{
				for(i=0;i<a.length;i++)
				{
					if(a[i]!=b[i])
					 c=false;
					
				}
			}
			else
			c=false;
			if(c==true)
			{
			System.out.println("Arrays are Equal");
			}
			else
			System.out.println("Arrays Not Equal");
	}

	
	public static void main(String arg[])
			{
		int a[]=new int[5];
		int b[]=new int[6];
		Equeality_of_To_Array sc=new Equeality_of_To_Array (a,b);
		sc.disp(a,b);
			}
}
