package Abstractionpractice23Dec;
import java.util.*;
abstract class Pair
{
	public abstract void input();
}
public class Pair_Of_Sum extends Pair {
int i,j,sum;
int a[]=new int[10];
Scanner sc=new Scanner(System.in);
	
	public void input() {
		System.out.println("Enter your Array");
		for(i=0;i<a.length;i++)
		{
		a[i]=sc.nextInt();
		}
		System.out.println("Enter your Sum");
		sum=sc.nextInt();
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==sum)
				{
					System.out.println(" Sum of pair=="+a[i]+" "+a[j]+" ");
				}
			}
		}
		
	}
	public static void main(String arg[])
	{
		Pair_Of_Sum ss=new Pair_Of_Sum();
		ss.input();
	}

}
