package Abstractionpractice23Dec;
import java.util.*;
abstract class xyz
{
	public abstract  void input();
	public abstract  void display();
	
}
public class Difference_between_largest_smallest extends  xyz{

	int i,j,t;
	int a[]=new int[10];
	Scanner ss=new Scanner(System.in);
	@Override
	public void input() {
		System.out.println("Enter Array");
		for(i=0;i<a.length;i++)
		{
		a[i]=ss.nextInt();
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
			
		}System.out.println("Difference of ="+(a[a.length-1]-a[0]));
		
	}

	@Override
	public void display() {
		
		
	}
	public static void main(String arg[])
	{
		Difference_between_largest_smallest sc=new Difference_between_largest_smallest();
		sc.input();
		
	}
}
