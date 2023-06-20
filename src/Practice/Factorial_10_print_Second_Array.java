package Practice;
import java.util.*;
public class Factorial_10_print_Second_Array {
	Scanner sc=new Scanner(System.in);
	int i,j,fact,t;
	int a[]=new int[5];
	int b[]=new int[a.length];
	public void input()
		{
		System.out.println("Enter your Array");
		
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			fact=1;
					for(j=1;j<=a[i];j++)
					{
				  fact=fact*j;
					}
					b[i]=fact;
					
					
			}
		for(i=0;i<b.length;i++)
		{
			System.out.println(b[i]+" ");
		}
       
		
		}
	public static void main(String arg[])
	{
		Factorial_10_print_Second_Array  ss=new Factorial_10_print_Second_Array ();
			ss.input();
		}
}
