//Q1.Write a Java program to find the maximum and minimum value of an array.
package Static_Example;
import java.util.*;
public class Max_Min {
	static int i,j;
	static int a[]=new int[10];
	static 
	{
		int max;
		int min;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		max=0;
		for(i=0;i<a.length;i++)
		{
			
				if(a[i]>max)
				max=a[i];
				
			
			
		}
		System.out.println("Max of Array=="+max);
		min=a[0];
		for(i=0;i<a.length;i++)
		{
			
				if(a[i]<min)
				min=a[i];
				
			
			
		}
		System.out.println("Min of Array=="+min);
	}
	public static void main(String arg[])
			{
		Max_Min ss =new Max_Min();
			}

}
