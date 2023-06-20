package Abstractionpractice23Dec;
import java.util.*;
abstract class abc
{
	public abstract void input1();
}
public class Average_largesat_smallest extends abc{

	int i,j,t,sum;
	int a[]=new int[10];
	Scanner sc=new Scanner(System.in);
	public void input1() {
		System.out.println("Enter Array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();

		}
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
			sum=0;
			for(i=1;i<a.length-1;i++)
			{
				sum=sum+a[i];
			}
			
		}System.out.println("Average of ="+sum/(a.length-2));
		
		
	}
	public static void main(String arg[])
	{
		Average_largesat_smallest ss=new Average_largesat_smallest();
		ss.input1();
	}

}
