package AsswithargNoarg;
/*Q11.Wap enter an array and print it in reverse order.*/

import java.util.*;

public class ReverseNoargNOretrn {
	int i;
	Scanner sc =new Scanner(System.in);
	public void input(int a[])
	{
		for( i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		
	}
	
	public static void main(String arg[])
	{
		int a[]= {1,2,3,5,6,7,8,9,10};
		ReverseNoargNOretrn sc=new ReverseNoargNOretrn();
		sc.input(a);
		
	}

}
