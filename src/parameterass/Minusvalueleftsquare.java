package parameterass;
/*Q9. WAP to replace all negative value with its immediate left elements square. Means 
arr[] = [12, 3, -19, 29, 5, -61, 44, 7, -9] 
Output array will be [12, 3, 9, 29, 5, 25, 44, 7, 49].*/
import java.util.*;
public class Minusvalueleftsquare {
	int i;
	int []a= {12,3,-19,29,5,-61,44,7,-9};
	public void input()
	{
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	public void disp()
	{
		for(i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				
				a[i]=a[i-1]*a[i-1];
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String arg[])
	{
		Minusvalueleftsquare sc=new Minusvalueleftsquare();
		sc.input();
		sc.disp();
	}

}
