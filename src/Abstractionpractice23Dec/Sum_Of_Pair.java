package Abstractionpractice23Dec;
import java.util.*;
abstract class LMNP
{
	public abstract void inpit6();
	
}
public class Sum_Of_Pair extends LMNP{
int i,j,k,c;
int a[]=new int[10];
Scanner sc=new Scanner(System.in);
	public void inpit6() {
		System.out.println("Enter Your Array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter Your Search Element");
		k=sc.nextInt();
		c=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==k)
			{
				c=1;
			}
		}
		if(c==1)
		
			System.out.println("Element are Fount");
			else
			System.out.println("Element are NOT Fount");
		
	}

	public static void main(String arg[])
	{
		Sum_Of_Pair ss=new Sum_Of_Pair();
		ss.inpit6();
	}

}
